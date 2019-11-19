package com.csaszarteam.fileuploader.service.validator;

import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserValidator {

    @Autowired
    private UserDAO userDAO;;

    private UserDTO userDTO;

    public UserValidator(){}

    public List<String> ErrorList(){
        List<String> errors=new ArrayList<>();
        String passwordMSG=passwordValidator(userDTO.getPassword());
        String usernameMSG=userNameValidator(userDTO.getUsername());
        String emailMSG=emailValidator(userDTO.getEmail());
        String nameMSG=nameValidator(userDTO.getName());
        if (!passwordMSG.equals("success")){
            errors.add(passwordMSG);
        }
        if(!usernameMSG.equals("success")){
            errors.add(usernameMSG);
        }
        if(!emailMSG.equals("success")){
            errors.add(emailMSG);
        }
        if(!nameMSG.equals("success")){
            errors.add(nameMSG);
        }
        return errors;
    }

    private String passwordValidator(String password){
        if(password.isEmpty()){
            return "empty";
        }
        if(password.length()<3){
            return "A jelszó legalább 4 karakter hoszzú kell legyen";
        }
        return "success";
    }

    private String userNameValidator(String username) {
        if (username==null||username.isEmpty()) {
            return "empty";
        }
        if (username.length() < 3) {
            return "A felhasználónév  legalább 4 karakter hoszzú kell legyen";
        }
        if (userDAO.findByUsername(username) != null) {
            return "A felhasználó nevet már használják";
        }
        return "success";
    }

    private String emailValidator(String email){
        if(email.isEmpty()){
            return "empty";
        }
        if(!EmailValidator.getInstance().isValid(email)){
            return "emailInvalid";
        }
        if(userDAO.findByEmail(email)!=null){
            return "Az email címet már használják";
        }
        return "success";
    }

    private String nameValidator(String name){
        if(name.isEmpty()){
            return "Nincs kitöltve a név";
        }else return "success";
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

}
