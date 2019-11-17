package com.csaszarteam.fileuploader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilelistController {

    @GetMapping("/filelist")
    public String showFilelist() {

        return "secured/filelist";
    }
}
