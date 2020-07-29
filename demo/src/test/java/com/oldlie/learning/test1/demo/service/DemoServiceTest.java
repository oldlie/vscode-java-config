package com.oldlie.learning.test1.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
public class DemoServiceTest {
    
    @Autowired
    private DemoService demoService;

    @Test
    public void adduser() throws Exception {
        Assert.isTrue(Integer.valueOf(1) == demoService.addUser("zhihao.miao"), "不行");
        Assert.isTrue(Integer.valueOf(0) == demoService.addUser(null), "也不行");
    }
}