package com.mvc.demo.mvcdemo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = {"", "/", "/index", "/home"}, method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    
}
