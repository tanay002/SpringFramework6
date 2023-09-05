package com.practice;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.dto.Runner;

@Configuration
@ComponentScan("com.practice.dto")
public class ApplicationLauncher {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationLauncher.class)) {
			context.getBean(Category.class).fetchDetails();
			
		context.getBean(Runner.class).run();
		} 
		

	}

}
