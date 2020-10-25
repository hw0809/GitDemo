package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class DevController {

	public String getMasterInfo324() {

        return "换了家公司，希望可以承受着压力!";
    }

    @RequestMapping("/")
    public String indexwer(Model model, HttpServletResponse response) {
        System.out.println("this is demo");
        return "/index";
    }
}
