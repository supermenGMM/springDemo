package com.mm.autowire;

import com.mm.bean.BeanAnnotaion;
import javafx.application.Application;
import org.junit.Test;
import org.junit.internal.builders.JUnit4Builder;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

/*@RunWith(BlockJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-annotation.xml")*/
@Service
public class AutowireApplication {
    @Autowired
    private ApplicationContext applicationContext ;

    @Test
    public void say() {
        System.out.println(applicationContext.getBean(BeanAnnotaion.class).getClass());
    }
}
