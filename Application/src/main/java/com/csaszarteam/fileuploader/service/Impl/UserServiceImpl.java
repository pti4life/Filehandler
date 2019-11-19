package com.csaszarteam.fileuploader.service.Impl;


import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.database.entity.UserRole;
import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import com.csaszarteam.fileuploader.service.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("userservice")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userdao;

    @Autowired
    UserValidator userValidator;

    @Override
    @Transactional("transactionManager")
    public List<String> saveUser(UserDTO userdto) {
        System.out.println("SERVICE CREATED");
        userValidator.setUserDTO(userdto);
        List<String> errors=userValidator.ErrorList();

       if(errors.isEmpty()) {
           String hashedPassword = new BCryptPasswordEncoder().encode(userdto.getPassword());
           User userentity = User.builder().id(userdto.getId()).username(userdto.getUsername()).email(userdto.getEmail())
                   .password(hashedPassword).build();
           //User userentity = new User(userdto.getName(), userdto.getEmail(), userdto.getUsername(), hashedPassword);
           UserRole ur = new UserRole(userentity, "USER");
           Set<UserRole> userRoles = new HashSet<>();
           userRoles.add(ur);
           userentity.setUserRoles(userRoles);
           System.out.println(userdao.save(userentity).getId());
       }
        System.out.println(errors);
        return errors;
    }

}
