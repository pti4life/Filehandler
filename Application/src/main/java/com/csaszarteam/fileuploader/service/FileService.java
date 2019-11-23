package com.csaszarteam.fileuploader.service;

import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface FileService {
     void save(MultipartFile file, String UPLOADED_FOLDER, UserDTO user);

     List getAllFiles(UserDTO userDTO);

     void deleteFile(String directory,String file,Long fileId);
}
