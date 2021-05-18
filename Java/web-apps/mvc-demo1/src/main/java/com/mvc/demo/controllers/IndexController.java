package com.mvc.demo.controllers;

import com.mvc.demo.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    /**
     * 
     * /, /index, /home
     */
    @RequestMapping(value = {"", "/", "/index", "/home"}, method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /**
     * 
     * /login
     */
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(User user){
        System.err.println(user);
        return "redirect:login";
    }

    /**
     * 
     * /register
     */
    @GetMapping("/register")
    public String register(){
        return "register";
    }

}
