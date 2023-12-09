package com.example.testfotmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @GetMapping("/")
    public String hello(){
        return "Hey, Spring Boot 的 Hello World ! ";
    }
    @GetMapping("/index")
    public String helloIndex(){
        return "index";
    }


}
