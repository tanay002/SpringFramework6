package com.practice;

public class Runner {

	private Category category;
	
    public Runner(Category category)
	{
		this.category=category;
	}
	
	public void run()
	{
		category.fetchDetails();
	}
}
