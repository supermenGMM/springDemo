package com.mm.base;

import com.mm.dao.PigDao;
import com.mm.service.PigService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import sun.java2d.pipe.SpanIterator;

@RunWith(BlockJUnit4ClassRunner.class)
public class SpringBeanTest extends  UnitTestBase {
    public SpringBeanTest() {
        super("spring-bean.xml");
    }

    /*
    通过get、set或构造器注入bean
     */
    @Test
    public void test() {
        PigService pigService= super.getBeanByName("pigService");
        pigService.say();

        PigDao pigDao= super.getBeanByName("pigDao");
        System.out.println(pigDao.hashCode());
    }


}
