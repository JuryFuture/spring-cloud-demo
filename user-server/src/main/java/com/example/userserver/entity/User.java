/**
 * Project Name: spring-cloud-demo
 * File Name: User.java
 * Package Name: com.example.userserver.entity
 * Date: 2019/2/11 11:04
 */
package com.example.userserver.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Description: User实体
 * @Author:滕国栋
 * @Date:2019/2/11
 */
@Entity
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;
}
