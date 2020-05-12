package com.test.study.controller;

import com.test.study.bean.User;
import com.test.study.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Kindy
 * @Description:
 * @date
 */

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
//        Optional<User> user=userRepository.findById(id);
        User user = userRepository.getOne(id);

        return user;
    }



    @GetMapping(value = "/user/create")
    public User insertUser(User user) {
        User   user1=userRepository.save(user);
        return user1;

    }

}
