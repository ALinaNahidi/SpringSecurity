package com.springsecurity.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DemoController {

    @GetMapping("/")
    public String Home(){
        return "home";
    }

    @GetMapping("/leaders")
    public String getLeaders(){
        return "leaders";
    }

    @GetMapping("/systems")
    public String getSystems(){
        return "systems";
    }

}
