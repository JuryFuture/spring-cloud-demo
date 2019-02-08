/**
 * Project Name: spring-cloud-demo
 * File Name: UserController.java
 * Package Name: com.example.userapi.controller
 * Date: 2019/2/8 23:30
 */
package com.example.userapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: UserController
 * @Author:滕国栋
 * @Date:2019/2/8
 */
@RestController
@RequestMapping("/user")
@Api("用户模块 API")
public class UserController {

    @ApiOperation(value = "根据ID查询用户信息", notes = "查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        return "用户" + id;
    }
}
