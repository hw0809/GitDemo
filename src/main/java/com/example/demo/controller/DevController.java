package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class DevController {

    @RequestMapping("/")
    public String indexwer(Model model, HttpServletResponse response) {
        System.out.println("this is demo");
        return "/index";
    }
}
