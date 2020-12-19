package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Greeting;
import com.example.demo.model.User;
import com.example.demo.service.IGreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

	@Autowired
    private IGreetingService greetingService;

    @GetMapping(value = {"/home"})
    public Greeting greeting(@RequestParam(value = "fname") String fname,@RequestParam(value = "lname") String lname) {
    	User user = new User();
        user.setFirstName(fname);
        user.setLastName(lname);
        return greetingService.addGreeting(user);
    }
}
