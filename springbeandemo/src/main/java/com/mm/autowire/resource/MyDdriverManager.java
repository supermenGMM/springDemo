package com.mm.autowire.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;

public class MyDdriverManager {

    public MyDdriverManager() {
    }

    public MyDdriverManager(String url, String username, String password){
        System.out.println("url:" + url);
        System.out.println("username:" + username);
        System.out.println("password:"+password);
    }


}
