package com.test;

import com.base.JunitTestBase;
import com.mm.aspectannotation.UsageTracked;
import com.mm.introduction.Car;
import com.mm.introduction.Fit;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.attribute.FileTime;

/**
 * aspect注解
 */
public class AspectAnnotationTest  extends JunitTestBase {
    public AspectAnnotationTest() {
        super("spring-aop-annotation.xml");
    }

    /**
     * 切入点、通知测试
     */

    @Test
    public void test1() {
        Fit fit = (Fit) applicationContext.getBean("fitImpl");
//        fit.say();//前置通知
//        fit.add();//返回后通知
//        fit.read();//异常后通知

        fit.fix(new Car("red"));
    }

    /**
     * introductions
     */
    @Test
    public void test2() {
        Fit fit = (Fit) applicationContext.getBean("fitImpl");
        fit.hello();
        if(fit instanceof UsageTracked){
            System.out.println("shide");
        }
    }
}
