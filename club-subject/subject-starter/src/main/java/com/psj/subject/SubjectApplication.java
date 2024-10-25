package com.psj.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 刷题微服务启动类
 * @author pengshj
 * @version 1.0
 * @date 2024/9/24-18:39
 * @description TODO
 */
@SpringBootApplication
@ComponentScan("com.psj")
public class SubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }
}
