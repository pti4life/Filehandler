package com.csaszarteam.fileuploader.service.Impl;


import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.database.entity.UserRole;
import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import com.csaszarteam.fileuploader.service.validator.UserValidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;


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

    @Autowired
    ModelMapper modelMapper;

    @Override
    @Transactional("transactionManager")
    public List<String> saveUser(UserDTO userdto) {
        System.out.println("SERVICE CREATED");
        userValidator.setUserDTO(userdto);
        List<String> errors=userValidator.ErrorList();

       if(errors.isEmpty()) {
           userdto.setPassword(new BCryptPasswordEncoder().encode(userdto.getPassword()));

           User userentity=modelMapper.map(userdto,User.class);
           userdao.save(userentity);
       }
        System.out.println(errors);
        return errors;
    }

}
