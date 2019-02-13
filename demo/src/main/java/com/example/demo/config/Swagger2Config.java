/**
 * Project Name: spring-cloud-demo
 * File Name: Swagger2Config.java
 * Package Name: com.example.demo.config
 * Date: 2019/2/4 0:12
 */
package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Description: Swagger2配置
 * @Author:滕国栋
 * @Date:2019/2/4
 */
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试 Swagger2")
                .contact(new Contact("JuryFuture", "http://www.baidu.com", "test@qq.com"))
                .version("1.0")
                .description("API 说明")
                .build();
    }
}
