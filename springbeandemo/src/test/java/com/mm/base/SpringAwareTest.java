package com.mm.base;

import com.mm.SpringAware;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class SpringAwareTest extends UnitTestBase {
    public SpringAwareTest() {
        super("spring-aware.xml");
    }

    @Test
    public void test() {
        SpringAware springAware = super.getBeanByClass(SpringAware.class);

    }

}
