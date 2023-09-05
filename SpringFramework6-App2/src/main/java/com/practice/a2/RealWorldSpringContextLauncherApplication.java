package com.practice.a2;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.Category;
import com.practice.dto.Runner;

@Configuration
@ComponentScan("com.practice.a2")
public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)) {
		
		int maxNo=context.getBean(BusinessCalculationService.class).findMax();
		System.out.println(maxNo);
		} 


	}

}
