package com.mm.autowire.singer.impl;

import com.mm.autowire.mystereotype.Format;
import com.mm.autowire.mystereotype.MyQulifier;
import com.mm.autowire.mystereotype.MyRepository;
import com.mm.autowire.singer.Singer;
import org.springframework.stereotype.Repository;

import java.text.Normalizer;

@MyRepository(value = "pig",format = Format.HIG)
public class Pig implements Singer{
    public void sing() {
        System.out.println("engkjds");
    }
}
