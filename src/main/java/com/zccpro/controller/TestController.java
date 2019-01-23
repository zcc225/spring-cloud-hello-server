package com.zccpro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
	@Value(value = "${server.port}")
	String port;
	

//	@Autowired
//	RestTemplate restTemplate;
	@RequestMapping("hello")
	public String hello() {
		return "hello"+port;
	}
}
