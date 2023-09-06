package com.practice.a5;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Person {

	private Address address;

	public Person(Address address) {
		super();
		this.address=address;
		System.out.println("All dependency are ready...");
	}
	
	
	@PostConstruct
	public void preInitilization()
	{
		System.out.println("Post Construct "+address.getAddress());
	}
	
	@PreDestroy
	public void cleanup()
	{
		System.out.println("Cleanng resources used...");
	}

}
