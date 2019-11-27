package com.csaszarteam.fileuploader.service;


import com.csaszarteam.fileuploader.service.domain.UserDTO;

import java.util.List;

public interface UserService {
    List<String> saveUser(UserDTO udto);

}
