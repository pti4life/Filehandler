package com.csaszarteam.fileuploader.service;

import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.web.multipart.MultipartFile;


public interface FileService {
     void save(MultipartFile file, String UPLOADED_FOLDER, UserDTO user);
}
