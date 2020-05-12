package com.test.study.mapper;

import com.test.study.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kindy
 * @Description:使用JPA
 * @date
 */


public interface UserRepository   extends JpaRepository<User,Integer> {
}
