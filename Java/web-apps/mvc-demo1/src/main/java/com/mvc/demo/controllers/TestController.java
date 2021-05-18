package com.mvc.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(@RequestParam("t-name") String name,
                        @RequestParam("t-id") Integer id){
        return "[ReqParam] Welcome " + name + " and your id is: " + id;
    }

    @GetMapping("/test2/{t-name}/{t-id}")
    public String test2(@PathVariable("t-name") String name,
                        @PathVariable("t-id") Integer id){
        return "[PathVar] Welcome " + name + " and your id is: " + id;
    }
    
}
