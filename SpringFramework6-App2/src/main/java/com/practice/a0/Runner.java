package com.practice.a0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Runner {

	private Category category;
	
	@Autowired
    public Runner(@Qualifier("faceCategories") Category category)
	{
		this.category=category;
	}
	
	public void run()
	{
		category.fetchDetails();
	}

	public Runner() {
		super();
	}
	
}
