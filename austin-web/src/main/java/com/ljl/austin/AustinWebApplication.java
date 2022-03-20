package com.ljl.austin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description:
 * @Author ljl
 * @Date: 2022/3/17 18:11
 * @Version 1.0
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class AustinWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AustinWebApplication.class, args);
    }
}
