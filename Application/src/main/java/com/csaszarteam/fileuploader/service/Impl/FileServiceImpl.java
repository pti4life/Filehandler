package com.csaszarteam.fileuploader.service.Impl;

import com.csaszarteam.fileuploader.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service("fileService")
public class FileServiceImpl implements FileService {
    @Override
    public void save(MultipartFile file, String directory) {

    }
}
