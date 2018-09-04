package com.mm;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.naming.NamingException;

public class BeanLifecycle implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("destory");
    }

    public void init() {
        System.out.println("初始化----");
    }

    public void destory() {
        System.out.println("销毁-----");
    }

    public void defaultInit() {
        System.out.println("默认初始化");
    }

    public void defaultDestory() {
        System.out.println("默认销毁");
    }
}
