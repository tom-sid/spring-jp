package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String name;
	
	public Person(@Value("123") int id, @Value("John") String name) {
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello World!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}