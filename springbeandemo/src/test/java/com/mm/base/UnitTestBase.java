package com.mm.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {
    public ClassPathXmlApplicationContext applicationContext ;
    public  String springXmlPath;
    public  UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }
    @Before
    public void before() {
        if(StringUtils.isEmpty(springXmlPath)){
            springXmlPath = "classpath:spring-*.xml";
        }
        applicationContext = new ClassPathXmlApplicationContext(springXmlPath.split(",\\s"));
        applicationContext.start();
    }

    @After
    public void after() {
        applicationContext.close();
    }

    protected <T extends  Object>T getBeanByName(String name) {
        return (T) applicationContext.getBean(name);
    }

    protected <T>T getBeanByClass(Class<T> clazz){
        return  applicationContext.getBean(clazz);
    }
}
