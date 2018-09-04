package com.mm.Annotation;

import com.mm.autowire.AutowireApplication;
import com.mm.autowire.MovieService;
import com.mm.autowire.SingerService;
import com.mm.autowire.genericity.IntegerStore;
import com.mm.autowire.genericity.MyConfiguration;
import com.mm.autowire.genericity.StringStore;
import com.mm.autowire.jsr.JsrService;
import com.mm.autowire.resource.MyDdriverManager;
import com.mm.autowire.resource.StoreConfig;
import com.mm.base.UnitTestBase;
import com.mm.bean.BeanAnnotaion;
import org.junit.Test;

import java.net.SocketTimeoutException;

public class BeanAnnotationTest  extends UnitTestBase{
    public BeanAnnotationTest() {
        super("spring-annotation.xml");
    }

    //component 和scope注解
    @Test
    public void test() {
         BeanAnnotaion beanAnnotation = super.getBeanByName("beanAnnotaion");
         beanAnnotation.say();

         BeanAnnotaion beanAnnotation2 = super.getBeanByName("beanAnnotaion");
         beanAnnotation2.say();

    }
    //命名策略测试
    @Test
    public void test2() {
//         BeanAnnotaion beanAnnotation = super.getBeanByName("hello");
//        BeanAnnotaion beanAnnotation = super.getBeanByClass(BeanAnnotaion.class);
        BeanAnnotaion beanAnnotation = super.getBeanByName("beanAnnotaion");
        beanAnnotation.say();

    }

    //autowire  reequire test
    @Test
    public void test3() {

        MovieService moiveService = super.getBeanByName("movieService");
        moiveService.save();
    }


    /**
     * autowire注入spring内置的bean
     */
    @Test
    public void test4() {
        AutowireApplication autowireApplication = super.getBeanByName("autowireApplication");
        autowireApplication.say();
    }

    @Test
    public void test5() {
        SingerService singerService = super.getBeanByName("singerService");
        singerService.sing();

//        Singer singer = super.getBeanByClass(Singer.class);
//        singer.sing();
        //qulifirer测试
        singerService.singerSing();
        singerService.singer2Sing();
    }

    /**
     * 自定义qulifier
     */
    @Test
    public void test6() {
        SingerService singerService = super.getBeanByName("singerService");
//        singerService.singer3Sing();
    }
    /**
     * 基于java容器的注解
     */
    @Test
    public void test7() {
        MyConfiguration myConfiguration =super.getBeanByClass(MyConfiguration.class);
        myConfiguration.test();
        StringStore strStore = super.getBeanByName("strStore");
        IntegerStore integerStore = super.getBeanByName("integerStore");
        strStore.say();
        integerStore.say();
    }
    /**
     * @ImportResource
     */
    @Test
    public void test8() {
        StoreConfig storeConfig = super.getBeanByName("storeConfig");
        storeConfig.say();
    }

    @Test
    public void test9() {
        JsrService jsrService =
                super.getBeanByName("jsrService");
        jsrService.save();
    }


}
