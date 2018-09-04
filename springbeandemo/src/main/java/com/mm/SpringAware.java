package com.mm;

import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

public class SpringAware implements ApplicationContextAware ,BeanNameAware{
    private ApplicationContext applicationContext ;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplication");
        this.applicationContext = applicationContext;
    }


    public void setBeanName(String name) {

        System.out.println("setBeanName,"+name);
    }
}
