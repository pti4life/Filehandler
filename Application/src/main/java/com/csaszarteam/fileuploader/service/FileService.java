package com.csaszarteam.fileuploader.service;

import org.springframework.web.multipart.MultipartFile;


public interface FileService {
     void save(MultipartFile file, String directory);
}
