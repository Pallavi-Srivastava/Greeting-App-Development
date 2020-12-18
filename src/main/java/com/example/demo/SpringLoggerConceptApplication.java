package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.component.DemoBean;

@SpringBootApplication
public class SpringLoggerConceptApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringLoggerConceptApplication.class);

	public static void main(String[] args) {
		
		logger.debug("Welcome to spring concept demo !!!");
		ApplicationContext context = SpringApplication.run(SpringLoggerConceptApplication.class, args);
		logger.debug("Checking context:" + context.getBean(DemoBean.class));
	}
}
