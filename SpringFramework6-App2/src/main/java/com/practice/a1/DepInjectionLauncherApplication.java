package com.practice.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.Category;
import com.practice.dto.Runner;

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {

			System.out.println(context.getBean(StudentService.class));
			
		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} 
		

	}

}
