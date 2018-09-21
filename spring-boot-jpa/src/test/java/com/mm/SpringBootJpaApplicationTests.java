package com.mm;

import com.mm.dao.supermeng.UserRepository;
import com.mm.dao.zhaomeng.FoodResposity;
import com.mm.domain.supermeng.User;
import com.mm.domain.zhaomeng.Food;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJpaApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Test
	public void contextLoads() {
//		userRepository.save(new User("bob",11));
//		userRepository.save(new User("amy",12));
//		userRepository.save(new User("tom",40));
//		userRepository.save(new User("bob",40));
//
//        List<User> bob = userRepository.findByName("bob");
//        System.out.println(bob.toArray().toString());
//
//        List<User> bob1 = userRepository.findByNameAndAge("bob", 11);
//        System.out.println(bob1.toString());
//
//        List<User> tom = userRepository.findUser("tom");
//        System.out.println(tom.size());
//
//
//        Assert.assertEquals(4, userRepository.findAll().size());
//        userRepository.delete(userRepository.getOne(1l));
//        Assert.assertEquals(10,userRepository.findAll().size());

        List<User> top5 = userRepository.findTop5();
        for (User u :
                top5) {
            System.out.println(u);
        }

    }

    @Autowired
    private FoodResposity foodResposity;
    /**
     * 双数据源测试
     */
    @Test
    public void testDoubleSource() {
        userRepository.save(new User("a",1));
        Food food = new Food();
        food.setName("榴莲");
        food.setNum(2);
        food.setType("臭的");
        foodResposity.save(food);
    }

}
