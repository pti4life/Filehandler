package com.csaszarTeam.fileUploader.repository;


import com.csaszarTeam.fileUploader.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {
    User findByUsername(String username);

}
