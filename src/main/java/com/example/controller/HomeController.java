package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("变量var的值为" + 2 + ",当前类=class.method");
        System.out.println("变量var的值为" + 9 + ",当前类=HomeController.hello");
        List list = new ArrayList();
        for (Object o : list) {
            System.out.println("变量sfd的值为" + ",当前类=HomeController.hello");
        }

        return "hello";
    }
}


