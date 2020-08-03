package com.zzy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestHello {
    @GetMapping("/fun1")
    public String fun1(){
        System.out.println("fffffffff");
        return "index";
    }
}
