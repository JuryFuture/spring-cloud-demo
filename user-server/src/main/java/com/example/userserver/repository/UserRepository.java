/**
 * Project Name: spring-cloud-demo
 * File Name: UserRepository.java
 * Package Name: com.example.userserver.repository
 * Date: 2019/2/11 11:28
 */
package com.example.userserver.repository;

import com.example.userserver.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Description: User Repository
 * @Author:滕国栋
 * @Date:2019/2/11
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
