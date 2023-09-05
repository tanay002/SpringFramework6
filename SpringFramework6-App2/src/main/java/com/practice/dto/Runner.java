package com.practice.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.practice.Category;

@Component
public class Runner {

	private Category category;
	
    public Runner(@Qualifier("faceEquipment") Category category)
	{
		this.category=category;
	}
	
	public void run()
	{
		category.fetchDetails();
	}
}
