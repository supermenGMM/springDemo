package com.base;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(BlockJUnit4ClassRunner.class)
public class JunitTestBase {
    protected ClassPathXmlApplicationContext applicationContext;

    private String configpath;

    protected JunitTestBase(String configpath){
        this.configpath = configpath;
    }

    @Before
    public void before() {
        if(StringUtils.isBlank(configpath)){
            configpath = "classpath:spring-*.xml";
        }
        applicationContext = new ClassPathXmlApplicationContext(configpath.split(" "));
        applicationContext.start();
    }

    @After
    public void after() {
        applicationContext.close();
    }

}
