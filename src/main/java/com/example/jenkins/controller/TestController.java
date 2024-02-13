package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 테스트 컨트롤러.
 *
 * @author 정승조
 * @version 2024. 02. 13.
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
