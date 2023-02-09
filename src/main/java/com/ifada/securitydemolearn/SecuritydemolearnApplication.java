package com.ifada.securitydemolearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ifada.securitydemolearn.mapper")
@SpringBootApplication
public class SecuritydemolearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecuritydemolearnApplication.class, args);
    }

}
