/**
 * Project Name: spring-cloud-demo
 * File Name: UserController.java
 * Package Name: com.example.userserver.controller
 * Date: 2019/2/11 11:14
 */
package com.example.userserver.controller;

import com.example.userserver.dto.ResponseDTO;
import com.example.userserver.dto.UserDTO;
import com.example.userserver.entity.User;
import com.example.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: User Controller
 * @Author:滕国栋
 * @Date:2019/2/11
 */
@Component
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseDTO getUser(@PathVariable long id) {
        User user = userService.getUser(id);
        Assert.notNull(user, String.format("用户%s不存在", id));

        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setAge(user.getAge());
        userDTO.setBalance(user.getBalance());
        userDTO.setUsername(user.getUsername());

        return new ResponseDTO(userDTO);
    }
}
