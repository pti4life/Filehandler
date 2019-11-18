package com.csaszarteam.fileuploader.service.Impl;

import com.csaszarteam.fileuploader.database.entity.File;
import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.database.repository.FileDAO;
import com.csaszarteam.fileuploader.service.FileService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service("fileService")
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDAO fileDAO;

    @Override
    public void save(MultipartFile file, String UPLOADED_FOLDER, User user) {
        try {
            uploadDatabase(file,user);
            File last=fileDAO.findTopByOrderByIdDesc();
            System.out.println(last);
            byte[] bytes = file.getBytes();
            Files.createDirectories(Paths.get(UPLOADED_FOLDER));
            Path path = Paths.get(UPLOADED_FOLDER,last.getId()+"."
                                 + FilenameUtils.getExtension(file.getOriginalFilename()));
            System.out.println(path);
            Files.write(path, bytes);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Transactional("transactionManager")
    void uploadDatabase(MultipartFile file, User user) throws IOException {
        File newfile=File.builder().fileName(file.getOriginalFilename())
                .mimeType(file.getContentType()).fileSize(file.getBytes().length)
                .user(user).build();
        fileDAO.save(newfile);
    }
}
