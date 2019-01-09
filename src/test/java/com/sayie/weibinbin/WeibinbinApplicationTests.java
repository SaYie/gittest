package com.sayie.weibinbin;

import com.sayie.weibinbin.dao.UserRepository;

import com.sayie.weibinbin.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeibinbinApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUsername("王小二");
        user.setPassword("123");
        this.userRepository.save(user);
    }
}

