package com.practice.a3;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.Category;
import com.practice.dto.Runner;

@Configuration
@ComponentScan()
public class LazyInitilizationLauncherApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyInitilizationLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("Initilization of context is completed");

			context.getBean(Person.class).demo();

		} 

		/*
 Once we launching a spring context we notice that the initialization would automatically be performed.
So even though we are not loading the bean up and we are not calling any methods on the bean, the initialization
of the bean is automatically performed.


We can use @Lazy Annotation to prevent this happening

So after lazy anntation it wlll be loaded when somebody is making use of it.
		 */
	}

}
