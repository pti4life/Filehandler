package com.csaszarteam.fileuploader.database.repository;

import com.csaszarteam.fileuploader.database.entity.File;
import com.csaszarteam.fileuploader.database.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileDAO extends CrudRepository<File,Long> {
    public File findTopByOrderByIdDesc();

    public List<File> getAllByUser(User user);

<<<<<<< HEAD
    boolean existsFileByUser(User user);
=======
    public void  deleteById(Long id);
>>>>>>> 7595fde569966357c7eaedba7f90448c76feca78
}
