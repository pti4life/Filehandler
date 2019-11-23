package com.csaszarteam.fileuploader.service.domain;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private Long id;

    private String name;

    private String email;

    private String username;

    private String password;

    //ez a pár +adatmező sunyiság, ne foglalkozzatok vele, kelle a userupdate-hez
    private String password2;

    private String password3;

    private String password4;

    public UserDTO(){}

    public UserDTO(String name, String email, String username, String password){
        this.name=name;
        this.email=email;
        this.username = username;
        this.password = password;
    }

    public Long getId(){return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getPassword3() {
        return password3;
    }

    public void setPassword3(String password3) {
        this.password3 = password3;
    }

    public String getPassword4() {
        return password4;
    }

    public void setPassword4(String password4) {
        this.password4 = password4;
    }

    @Override
    public String toString() {
        return "users dto{" +
                " name="+name+
                ", email="+email+
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
