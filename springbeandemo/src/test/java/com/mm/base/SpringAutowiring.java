package com.mm.base;

import com.mm.dao.PigDao;
import com.mm.service.PigService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import javax.sound.midi.Soundbank;

@RunWith(BlockJUnit4ClassRunner.class)
public class SpringAutowiring extends UnitTestBase {
    public SpringAutowiring() {
        super("spring-autowiring.xml");
    }

    @Test
    public void test() {
        PigService pigDao = super.getBeanByName("pigService");
        pigDao.say();
    }

}
