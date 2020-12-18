package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	// http://localhost:1728/hello/home
	@RequestMapping(value = { "/home", "/", "" })
	public String sayHello() {
		return "Hello World !";
	}
}
