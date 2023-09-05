package com.practice;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.dto.Brand;
import com.practice.dto.FaceEquipment;
import com.practice.dto.Mobile;

//@SpringBootApplication
public class SFApproach2Application {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurationApp.class)) {
			context.getBean(Category.class).fetchDetails();
			
		context.getBean(Runner.class).run();
		} 
		

	}

}
