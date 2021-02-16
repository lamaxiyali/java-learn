package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class IndexService {

    @Autowired
    UserService userService;
    public IndexService(){
        System.out.println("IndexService construtor");
    }
    public void  getUser(){
        System.out.println(userService.getClass().getSimpleName());
    }

}
