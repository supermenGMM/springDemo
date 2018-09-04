package com.mm.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value =  ConfigurableBeanFactory.SCOPE_PROTOTYPE )
public class BeanAnnotaion2 {
    public void say() {
        System.out.println("beanAnnotation"+this.hashCode());
    }
}
