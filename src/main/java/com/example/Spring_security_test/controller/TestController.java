package com.example.Spring_security_test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {



    @GetMapping("user")
    public String userTest(){
        return "user api works";
    }

    @GetMapping("dev")
    public String devTest(){
        return "developer api works";
    }

    @GetMapping("Admin")
    public String adminTest(){
        return "admin api works";
    }

}
