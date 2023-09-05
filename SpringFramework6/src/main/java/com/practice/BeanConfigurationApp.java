package com.practice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practice.dto.Brand;
import com.practice.dto.FaceEquipment;
import com.practice.dto.Mobile;

@Configuration
public class BeanConfigurationApp 
{
	@Bean
	@Primary
	public Category category(Brand brand) {
		return new Mobile(2, "Lava Z9", 1200, brand);
	}
	
	
	@Bean
	public Runner runner(@Qualifier("category2") Category category)
	{
		var runner=new Runner(category);
		return runner;
	}
	
	@Bean
	@Qualifier("category2")
	public Category categoryTwo(@Qualifier("brand2") Brand brand) {
		return new FaceEquipment(2, "Nivea Mens Cream", 100, brand);
	}

	@Bean
	@Primary
	public Brand brand() {
		return new Brand(3L,"Electronics");
	}

	@Bean
	@Qualifier("brand2")
	public Brand brand2() {
		return new Brand(3L,"Cosmatics");
	}
}
