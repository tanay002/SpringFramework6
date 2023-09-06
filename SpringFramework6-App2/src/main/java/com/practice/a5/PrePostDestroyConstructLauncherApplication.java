package com.practice.a5;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class PrePostDestroyConstructLauncherApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(PrePostDestroyConstructLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			/*

 if we want to do certain operation before a bean is removed from the container
 than we would use pre-destroy annotation

If we want to execute some initialization logic as soon as the dependencies are wired in,
then we would use post construct.
			 */
		} 

	}

}
