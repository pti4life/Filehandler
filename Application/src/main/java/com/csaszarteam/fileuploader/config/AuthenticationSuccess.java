package com.csaszarteam.fileuploader.config;

import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationSuccess implements AuthenticationSuccessHandler {
    @Autowired
    UserDAO userDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        System.out.println("meghivodunk");
        request.getSession().setAttribute("user",modelMapper.map(userDAO.findByUsername(authentication.getName()),UserDTO.class));
       // response.sendRedirect(request.getContextPath()+"/upload");
        System.out.println(request.getSession().getAttribute("user"));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/filelist");
        dispatcher.forward(request, response);

    }
}
