package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/service")
@Slf4j
public class TestController {

	@GetMapping("/test")
	public String getMsg() {
		return "Application is working";
	}

}
