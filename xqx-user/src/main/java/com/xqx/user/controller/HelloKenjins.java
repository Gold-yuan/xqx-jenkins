package com.xqx.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKenjins {

	@GetMapping(value = "/hello")
	public String hello() {
		
		return "hello luck boy! This is next version!2018-09-11测试";
	}
	@RequestMapping(value = "/hello2")
	public String hello2() {
		
		return "hello2";
	}
}
