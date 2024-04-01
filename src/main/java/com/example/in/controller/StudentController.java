package com.example.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/student")
@Controller
public class StudentController {


    @GetMapping(value = "/")
    public String showHomePage(){
        return "home";
    }
	
    
    @GetMapping(value = "/signup")
    public String showSignupPage(){
        return "signup";
    }
    
    @PostMapping(value = "/signup")
    public String showStatusPage(){
        return "signup";
    }
    
}
