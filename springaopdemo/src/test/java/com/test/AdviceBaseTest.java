package com.test;

import com.base.JunitTestBase;
import com.mm.introduction.Fit;
import com.mm.serivce.impl.MovieService;
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
//        myService.update();
//        myService.play("aaa",2);
//        myService.save(2);
        myService.save2(2);
//
//        MovieService myService2 = (MovieService) applicationContext.getBean("movieService");
//        myService.save(3);
    }

    /**
     * introductions
     */
    @Test
    public void test2() {
        Fit movieService = (Fit) applicationContext.getBean("movieService");
        movieService.say();
        Fit movieService2 = (Fit) applicationContext.getBean("movieService");
        movieService2.say();
    }
}

