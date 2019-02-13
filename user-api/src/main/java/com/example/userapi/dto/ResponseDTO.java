/**
 * Project Name: spring-cloud-demo
 * File Name: ResponseDTO.java
 * Package Name: com.example.userserver.dto
 * Date: 2019/2/11 11:16
 */
package com.example.userapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: Response DTO
 * @Author:滕国栋
 * @Date:2019/2/11
 */
@Getter
@Setter
@ToString
public class ResponseDTO {
    private int code;
    private String description;
    private Object result;

    public ResponseDTO(Object result) {
        this.code = 0;
        this.description = "SUCCESS";
        this.result = result;
    }

    public ResponseDTO(int code, String description, Object result) {
        this.code = code;
        this.description = description;
        this.result = result;
    }
}
