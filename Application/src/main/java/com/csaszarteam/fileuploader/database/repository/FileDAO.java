package com.csaszarteam.fileuploader.database.repository;

import com.csaszarteam.fileuploader.database.entity.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDAO extends CrudRepository<File,Long> {
    public File findTopByOrderByIdDesc();
}
