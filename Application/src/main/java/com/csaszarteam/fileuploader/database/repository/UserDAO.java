package com.csaszarteam.fileuploader.database.repository;


import com.csaszarteam.fileuploader.database.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);

}
