package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    IndexService indexService;

    public UserService(){
        System.out.println("UserService Constructor");
    }
    public void getService(){
        System.out.println(indexService.getClass().getSimpleName());
    }
}
