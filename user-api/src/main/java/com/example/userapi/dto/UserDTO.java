/**
 * Project Name: spring-cloud-demo
 * File Name: UserDTO.java
 * Package Name: com.example.userserver.dto
 * Date: 2019/2/11 11:13
 */
package com.example.userapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @Description: User DTO
 * @Author:滕国栋
 * @Date:2019/2/11
 */
@Getter
@Setter
@ToString
public class UserDTO {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
