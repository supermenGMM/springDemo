package com.mm.test.controller;

import com.mm.test.pojo.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@ResponseBody
public class Hello2Controller {
    @Autowired
    private PersonProperties personProperties;
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }
}

