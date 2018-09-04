package com.mm.autowire.singer.impl;

import com.mm.autowire.singer.Singer;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Repository
@Order(value = 1)
public class Cat implements Singer {
    public void sing() {
        System.out.println("喵喵喵");
    }
}
