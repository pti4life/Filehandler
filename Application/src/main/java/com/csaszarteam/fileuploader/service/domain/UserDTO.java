package com.csaszarteam.fileuploader.service.domain;

import java.util.Set;


public class UserDTO {

    private Long id;

    private String username;

    private String password;

    private boolean enabled;

    private Set<UserRoleDTO> userRoles;

    public Set<UserRoleDTO> getUserRoles() {
        return userRoles;
    }

    public UserDTO(){}

    public UserDTO(Long id, String username, String password, boolean enabled, Set<UserRoleDTO> userRoles){
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.id=id;
        this.userRoles = userRoles;
    }

    public void setUserRoles(Set<UserRoleDTO> userRoles) {
        this.userRoles = userRoles;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "user dto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
