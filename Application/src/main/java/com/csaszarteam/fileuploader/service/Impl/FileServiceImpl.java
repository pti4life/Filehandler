package com.csaszarteam.fileuploader.service.Impl;

import com.csaszarteam.fileuploader.database.entity.File;
import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.database.repository.FileDAO;
import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.FileService;
import com.csaszarteam.fileuploader.service.domain.FileDTO;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.*;
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

    private static String UPLOADED_FOLDER = "D:\\TMP\\";

    @Override
    public void save(MultipartFile file, String UPLOADED_FOLDER, UserDTO user) {
        try {
            long fileID=uploadDatabase(null,file,user);
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




    @Override
    public String downloadFile(FileDTO filedto ,UserDTO user,HttpServletResponse resp ) {
        Path file = Paths.get(UPLOADED_FOLDER + filedto.getUser().getId() + "\\", filedto.getFileName());
        User userentity = modelMapper.map(user, User.class);
        if (Files.exists(file) && fileDAO.existsFileByUser(userentity)) {
            resp.setContentType(filedto.getMimeType());
            resp.addHeader("Content-Disposition", "attachment; filename=" + filedto.getFileName());
            try {
                Files.copy(file, resp.getOutputStream());
                resp.getOutputStream().flush();
            } catch (IOException ioex) {
                ioex.printStackTrace();
            }

        } else {
            return "error";
        }
        return "success";

    }

    @Override
    public void deleteFile(String directory,String file,Long fileId) {
        java.io.File folder=new java.io.File(directory);
        java.io.File  tempFile = new java.io.File(directory+"\\"+file);
        System.out.println(folder.isDirectory());
        if(tempFile.isFile()){
            deleteFromDatabase(fileId);
            tempFile.delete();
        }

        if(folder.isDirectory()){
            if(folder.listFiles().length==0){
                folder.delete();
            }
        }

    }

    @Override
    public void makeFile(String folder,String name, String content,UserDTO userDTO,Long id) throws IOException {
        String type=name.substring(name.lastIndexOf("."));
        if(id==null){
             id=uploadDatabase(id,converter(new java.io.File(""),name,content),userDTO);
        }
        java.io.File  file = new java.io.File(folder+id+type);
        java.io.File directory=new java.io.File(folder);

        if(!file.isFile()){
            System.out.println("ujjj fajjjjl");
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
            writer.newLine();
            writer.write(content);
            writer.close();

        }else {
            System.out.println("nem ujj");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
            System.out.println(writer);

            writer.newLine();
            writer.write(content);
            writer.close();
            uploadDatabase(id,converter(file,name,content),userDTO);
        }
        System.out.println(content);
    }

    public String getContent(String path) throws IOException {
        return new String ( Files.readAllBytes( Paths.get(path) ) );
    }

    @Transactional("transactionManager")
    long uploadDatabase(Long id,MultipartFile file, UserDTO userDTO) throws IOException {
        User userEntity=modelMapper.map(userDTO,User.class);
        File newfile=File.builder().id(id).fileName(file.getOriginalFilename())
                .mimeType(file.getContentType()).fileSize(file.getBytes().length)
                .user(userEntity).modify(LocalDate.now()).build();

        fileDAO.save(newfile);
        return newfile.getId();
    }

    @Transactional("transactionManager")
    void deleteFromDatabase(Long id){
        fileDAO.deleteById(id);
    }



    private MultipartFile converter(java.io.File file,String fileName,String content){
        return new MultipartFile() {
            @Override
            public String getName() {
                return "file";
            }

            @Override
            public String getOriginalFilename() {
                return fileName;
            }

            @Override
            public String getContentType() {
                return "plain/text";
            }

            @Override
            public boolean isEmpty() {
                try {
                    return IOUtils.toByteArray(new FileInputStream(file)).length==0;
                } catch (IOException e) {
                    e.printStackTrace();
                    return true;
                }
            }

            @Override
            public long getSize() {
                try {
                    return  IOUtils.toByteArray(new FileInputStream(file)).length;
                } catch (IOException e) {
                    e.printStackTrace();
                    return 0;
                }
            }

            @Override
            public byte[] getBytes() {
                return content.getBytes();
            }

            @Override
            public InputStream getInputStream()  {
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            public void transferTo(java.io.File dest) throws IOException, IllegalStateException {
            }
        };
    }

}
