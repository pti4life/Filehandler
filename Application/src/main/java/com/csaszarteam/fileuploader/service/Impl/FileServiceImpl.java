package com.csaszarteam.fileuploader.service.Impl;

import com.csaszarteam.fileuploader.database.entity.File;
import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.database.repository.FileDAO;
import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.FileService;
import com.csaszarteam.fileuploader.service.domain.FileDTO;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.apache.commons.io.FilenameUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Service("fileService")
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDAO fileDAO;


    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(MultipartFile file, String UPLOADED_FOLDER, UserDTO user) {
        try {
            long fileID=uploadDatabase(file,user);
            byte[] bytes = file.getBytes();
            Files.createDirectories(Paths.get(UPLOADED_FOLDER));
            Path path = Paths.get(UPLOADED_FOLDER,fileID+"."
                                 + FilenameUtils.getExtension(file.getOriginalFilename()));
            System.out.println(path);
            Files.write(path, bytes);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List getAllFiles(UserDTO userDTO) {
        User user=modelMapper.map(userDTO,User.class);
        List<File> filesEntity=fileDAO.getAllByUser(user);
        List<FileDTO> filesDTO=new LinkedList<>();
        for (File file:filesEntity){
            filesDTO.add(modelMapper.map(file,FileDTO.class));
        }
        return filesDTO;
    }

    @Transactional("transactionManager")
    long uploadDatabase(MultipartFile file, UserDTO userDTO) throws IOException {
        User userEntity=modelMapper.map(userDTO,User.class);
        File newfile=File.builder().fileName(file.getOriginalFilename())
                .mimeType(file.getContentType()).fileSize(file.getBytes().length)
                .user(userEntity).modify(LocalDate.now()).build();

        fileDAO.save(newfile);
        return newfile.getId();
    }
}
