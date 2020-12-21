package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="greet")
public class Greeting {

	@Id
	private long id;
	private String greeting;
	
	public Greeting() {
        id = 0;
        greeting = "";
    }

	public Greeting(long id, String greeting) {
		super();
		this.id = id;
		this.greeting = greeting;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String name) {
		this.greeting = name;
	}
}
