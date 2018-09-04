package com.mm.base;

import com.mm.BeanLifecycle;
import org.junit.Test;

public class BeanLifeCycleTest extends UnitTestBase {
    public BeanLifeCycleTest() {
        super("spring-bean.xml");
    }


    @Test
    public void test() {
        BeanLifecycle beanByclass = super.getBeanByClass(BeanLifecycle.class);

    }
}
