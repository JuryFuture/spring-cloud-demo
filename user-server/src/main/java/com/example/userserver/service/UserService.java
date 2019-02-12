/**
 * Project Name: spring-cloud-demo
 * File Name: UserService.java
 * Package Name: com.example.userserver.service
 * Date: 2019/2/11 11:21
 */
package com.example.userserver.service;

import com.example.userserver.entity.User;
import com.example.userserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: User Service
 * @Author:滕国栋
 * @Date:2019/2/11
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(long id) {
        return userRepository.findById(id).get();
    }
}
