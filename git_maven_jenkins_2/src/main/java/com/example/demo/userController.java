package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @GetMapping(value = "/user")
    public user Getusers(){
        user user1=new user();
        return user1;
    }
}
