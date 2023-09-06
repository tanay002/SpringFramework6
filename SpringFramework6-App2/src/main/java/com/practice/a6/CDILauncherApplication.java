package com.practice.a6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan()
public class CDILauncherApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(CDILauncherApplication.class)) {
		
		int maxNo=context.getBean(BusinessCalculationService.class).findMax();
		System.out.println(maxNo);
		} 


	}

}
