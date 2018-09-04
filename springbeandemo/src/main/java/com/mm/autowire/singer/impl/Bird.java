package com.mm.autowire.singer.impl;

import com.mm.autowire.singer.Singer;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Repository
@Primary
@Order(value = 2)
public class Bird implements Singer {
    public void sing() {
        System.out.println("叽叽喳喳");
    }
}
