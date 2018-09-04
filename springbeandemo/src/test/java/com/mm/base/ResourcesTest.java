package com.mm.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.core.io.Resource;

import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class ResourcesTest extends UnitTestBase {
    public ResourcesTest() {
        super("spring-resource.xml");
    }

    @Test
    public void test() throws IOException {
        Resource resource = applicationContext.getResource("classpath:context.txt");
        System.out.println(resource.getFilename()+"，"+resource.getURI().toString()+",,url:"+resource.getURL().toString());
    }
}
