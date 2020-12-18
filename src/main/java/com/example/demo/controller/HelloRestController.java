package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	// http://localhost:1728/hello/home
	@RequestMapping(value = { "/home", "/", "" })
	public String sayHello() {
		return "Hello World !";
	}

	// http://localhost:1728/hello/put/siya/?lastName=srivastava
	@RequestMapping(value = { "/query" }, method = RequestMethod.GET)
	public String sayHello(@RequestParam("fname") String fname, @RequestParam("lname") String lname) {
		return "Hello " + fname + " " + lname;
	}

	// http://localhost:1728/hello/param/siya
	@RequestMapping("/param/{name}")
	public String syaHelloParam(@PathVariable String name) {
		return "Hello " + name + "!!";
	}

	// http://localhost:1728/hello/post
	@RequestMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + "!!!";
	}

	// http://localhost:1728/hello/put/siya/?lastName=srivastava
	@PutMapping("/put/{firstName}")
	public String sayHiii(@PathVariable String firstName, @RequestParam("lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + "!!!";
	}
}
