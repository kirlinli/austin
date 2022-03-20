package com.ljl.austin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author ljl
 * @Date: 2022/3/17 18:09
 * @Version 1.0
 */
@RestController
public class WebTest {

    @GetMapping("/hello")
    public String fun() {
        return "Hello World";
    }
}
