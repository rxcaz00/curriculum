package com.edu.appswbd.practica.dos.curriculum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CVController {

    @RequestMapping(path="/inicio")
    public String estado () {
        return "inicio";
    }
}

