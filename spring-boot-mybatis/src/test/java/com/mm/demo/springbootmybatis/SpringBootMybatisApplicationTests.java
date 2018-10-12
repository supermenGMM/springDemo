package com.mm.demo.springbootmybatis;

import com.mm.demo.dao.CityDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

	@Autowired
	private CityDao cityDao;
	@Test
	public void contextLoads() {
		cityDao.findByName("温岭市");
	}

}
