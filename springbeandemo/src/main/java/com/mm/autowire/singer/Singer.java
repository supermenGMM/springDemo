package com.mm.autowire.singer;

import org.springframework.core.env.SystemEnvironmentPropertySource;

import javax.xml.bind.annotation.XmlType;

public interface Singer {
    default void sing() {
        System.out.println("唱歌");
    }

}
