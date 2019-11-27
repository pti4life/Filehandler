package com.csaszarteam.fileuploader.service;

import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface FileService {
     void save(MultipartFile file, String UPLOADED_FOLDER, UserDTO user);

     List getAllFiles(UserDTO userDTO);

     void deleteFile(String directory,String file,Long fileId);

     void makeFile(String folder,String name,String content,UserDTO userDTO,Long id) throws IOException;

     String getContent(String path) throws IOException;

}
