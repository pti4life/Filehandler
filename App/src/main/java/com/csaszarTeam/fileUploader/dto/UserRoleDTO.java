package com.csaszarteam.fileuploader.dto;

public class UserRoleDTO {
    private long id;

    private UserDTO user;

    private String authority;

    public UserRoleDTO(){}

    public UserRoleDTO(long id,UserDTO user, String authority) {
        this.id=id;
        this.user = user;
        this.authority = authority;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", user=" + user +
                ", authority='" + authority + '\'' +
                '}';
    }
}
