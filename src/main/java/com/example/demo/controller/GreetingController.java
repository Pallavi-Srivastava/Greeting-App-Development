package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Greeting;
import com.example.demo.service.IGreetingService;

@RestController
public class GreetingController {
	private static final String template="Hello, %s!";
	private final AtomicLong counter=new AtomicLong();
	
	@Autowired
	private IGreetingService GreetingService;
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}
	
	@GetMapping("/greetingMsg")
	public String greetingMsg(String msg) {
		return GreetingService.message(msg);
	}
}
