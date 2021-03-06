package com.example.thymeleafdemo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DefaultController {
    
    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/admin")
    public String admin() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("username: " + auth.getName());
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }
    
    @GetMapping("/teacher")
    public String teacher() {
        return "/teacher";
    }

    
    @GetMapping("/student")
    public String student() {
        return "/student";
    }


    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
    
    @GetMapping("/layout")
    public String layout() {
        return "/layout_sample";
    }

}
