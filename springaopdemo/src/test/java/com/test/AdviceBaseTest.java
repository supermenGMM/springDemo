package com.test;

import com.base.JunitTestBase;
import com.mm.serivce.MovieService;
import org.junit.Test;

public class AdviceBaseTest extends JunitTestBase {
    public AdviceBaseTest() {
        super("spring-aop.xml");
    }

    /**
     * 通知测试
     */
    @Test
    public void test() {
        MovieService myService = (MovieService) applicationContext.getBean("movieService");
        myService.save();
    }
}

