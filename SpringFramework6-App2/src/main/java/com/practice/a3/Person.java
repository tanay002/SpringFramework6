package com.practice.a3;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // Now Class Bean is not initialized during startup
public class Person {

	private PermanentAddress permanentAddress;
	
	public Person(PermanentAddress permanentAddress)
	{
		System.out.println("Some Initialization Logic...");
		this.permanentAddress=permanentAddress;	
	}
	
	public void demo()
	{
		System.out.println("Demo...");
	}
}
