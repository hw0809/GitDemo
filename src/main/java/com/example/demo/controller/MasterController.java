package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

public class MasterController {

    @RequestMapping("/")
    public String indexwer(Model model, HttpServletResponse response) {
        System.out.println("this is demo");
        return "/index";
    }
}
