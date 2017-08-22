package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		Person bean = context.getBean(Person.class);
		bean.speak();
	}
}
