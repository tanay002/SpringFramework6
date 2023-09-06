package com.practice.a5;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Address {

	public String getAddress()
	{
		return "Sky Heigh Indore";
	}
}
