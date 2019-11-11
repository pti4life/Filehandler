package com.csaszarteam.fileuploader.repository;


import com.csaszarteam.fileuploader.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {
    User findByUsername(String username);

}
