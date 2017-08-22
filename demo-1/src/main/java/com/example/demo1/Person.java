package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("321")
	private int id;
	@Value("Joey")
	private String name;

	public void speak() {
		System.out.println("Hello World!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}