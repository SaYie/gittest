package com.sayie.weibinbin.dao;

import com.sayie.weibinbin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @auther Sayie
 * @date 2019/1/9 10:08
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
