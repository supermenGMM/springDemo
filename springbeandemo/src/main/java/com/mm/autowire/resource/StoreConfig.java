package com.mm.autowire.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

@Service
@ImportResource("classpath:config.xml")
public class StoreConfig {
    @Value("${url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${password}")
    private String password;

    @Bean
    public MyDdriverManager myDdriverManager() {
        return new MyDdriverManager(url, username, password);
    }
    public void say(){
        System.out.println("url:" + url);
        System.out.println("username:" + username);
        System.out.println("password:"+password);
    }

}
