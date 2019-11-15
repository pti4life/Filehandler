package com.csaszarteam.fileuploader.service.Impl;


import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.database.entity.UserRole;
import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.HashSet;
import java.util.Set;

@Service("userservice")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userdao;

    @Override
    @Transactional("transactionManager")
    public void saveUser(UserDTO userdto) {
        System.out.println("SERVICE CREATED");
        User userentity=new User(userdto.getName(), userdto.getEmail(), userdto.getUsername(), userdto.getPassword());
        UserRole ur=new UserRole(userentity,"user");
        Set<UserRole> userRoles= new HashSet<>();
        userRoles.add(ur);
        userentity.setUserRoles(userRoles);
        userdao.save(userentity);

    }
}
