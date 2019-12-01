package com.csaszarteam.fileuploader.service.Impl;


import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import com.csaszarteam.fileuploader.service.validator.UserValidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

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

    @Override
    @Transactional("transactionManager")
    public String updateEmail(UserDTO userDTO) {
        String error = userValidator.emailValidator(userDTO.getEmail());

        if(error.equals("success")) {
            User user = modelMapper.map(userDTO, User.class);
            userdao.save(user);
        }

        return error;
    }

    @Override
    @Transactional("transactionManager")
    public String updateUserName(UserDTO userDTO) {
        String error = userValidator.userNameValidator(userDTO.getUsername());

        if(error.equals("success")) {
            User user = modelMapper.map(userDTO, User.class);
            userdao.save(user);
        }

        return error;
    }

    @Override
    @Transactional("transactionManager")
    public String updatePassword(UserDTO userDTO) {
        String error = userValidator.passwordValidator(userDTO.getPassword());

        if(error.equals("success")) {
            String newHashedPass = new BCryptPasswordEncoder().encode(userDTO.getPassword());
            userDTO.setPassword(newHashedPass);

            User user = modelMapper.map(userDTO, User.class);
            userdao.save(user);
        }

        return error;
    }

}
