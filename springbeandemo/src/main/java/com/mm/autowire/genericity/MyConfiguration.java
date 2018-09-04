package com.mm.autowire.genericity;

import com.sun.javafx.logging.PulseLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.print.attribute.standard.MediaSize;
import java.util.Set;

@Configuration
public class MyConfiguration {
    @Bean(name = "strStore",initMethod = "init",destroyMethod = "destory")
    public StringStore stringStore(){
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }
    @Autowired
    private StringStore s1;
    @Autowired
    private IntegerStore s2;

    @Autowired
    private Store<String> s3;
    @Autowired
    private Store<Integer> s4;


    public void test() {
        s1.say();
        s2.say();
        s3.say();
        s4.say();
    }
}
