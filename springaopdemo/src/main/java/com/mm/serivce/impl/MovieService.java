package com.mm.serivce.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Primary
@Order(1)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MovieService {
    public void save(int a) {
        System.out.println("save---"+a);
    }

    public void save2(int a) {
        System.out.println("save exception"+a);
        throw new RuntimeException("抛出异常");
    }

    public void play(String name, int age) {
        System.out.println("电影放映"+name);
    }
}
