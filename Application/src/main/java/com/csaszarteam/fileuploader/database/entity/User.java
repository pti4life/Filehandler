package com.csaszarteam.fileuploader.database.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

  //  @UniqueElements
    private String username;

    private String password;

    private boolean enabled;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<com.csaszarteam.fileuploader.database.entity.UserRole> UserRole;

    public Set<com.csaszarteam.fileuploader.database.entity.UserRole> getUserRole() {
        return UserRole;
    }


    public User(){}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.enabled = true;
    }

    public void setUserRole(Set<com.csaszarteam.fileuploader.database.entity.UserRole> userRole) {
        this.UserRole = userRole;
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
        return "users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}