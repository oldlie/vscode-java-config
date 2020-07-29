package com.oldlie.learning.test1.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    
    public Integer addUser(String username) {
        System.out.println("user dao adduser [username="+username+"]");
        if(username == null){
            return 0;
        }
        return 1;
    }
}