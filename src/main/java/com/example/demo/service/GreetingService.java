package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Greeting;
import com.example.demo.model.User;

@Service
public class GreetingService implements IGreetingService {

	@Override
	public Greeting addGreeting(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Greeting getGreetingById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message(String msg) {
		// TODO Auto-generated method stub
		return "Hello World !!!";
	}
}
