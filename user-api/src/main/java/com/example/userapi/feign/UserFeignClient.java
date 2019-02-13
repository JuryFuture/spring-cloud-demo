/**
 * Project Name: spring-cloud-demo
 * File Name: UserManagement.java
 * Package Name: com.example.userapi.feign
 * Date: 2019/2/12 15:28
 */
package com.example.userapi.feign;

import com.example.userapi.dto.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description: UserFeignClient
 * @Author:滕国栋
 * @Date:2019/2/12
 */
@FeignClient(name = "user-server")
public interface UserFeignClient {
    @GetMapping(value = "/user/{id}")
    ResponseDTO getUser(@PathVariable long id);
}
