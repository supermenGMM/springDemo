package com.mm;

import com.mm.domain.supermeng.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringBootRedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String,User> redisTemplate;


    @Test
    public void test() {
        stringRedisTemplate.opsForValue().set("bear", "小熊维尼");
        Assert.assertEquals("小熊维尼", stringRedisTemplate.opsForValue().get("bear"));
        System.out.println(stringRedisTemplate.opsForValue().get("bear"));
    }

    @Test
    public void testObjectTemple() {
        User u = new User("超人", 2);
        u.setId(1L);
        redisTemplate.opsForValue().set(u.getId()+"", u);

        User u2 = new User("蝙蝠侠", 4);
        u2.setId(2L);
        redisTemplate.opsForValue().set(u2.getId()+"", u2);

        System.out.println(redisTemplate.opsForValue().get("1"));
        Assert.assertEquals(2,redisTemplate.opsForValue().get("1").getAge().longValue());

    }
}
