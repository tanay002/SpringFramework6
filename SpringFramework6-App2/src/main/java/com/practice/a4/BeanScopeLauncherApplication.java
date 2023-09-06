package com.practice.a4;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class BeanScopeLauncherApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {

			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		  System.out.println(context.getBean(NormalClass.class));
		  System.out.println(context.getBean(NormalClass.class));
		  System.out.println(context.getBean(NormalClass.class));
		  
		  System.out.println(context.getBean(PrototypeClass.class));
		  System.out.println(context.getBean(PrototypeClass.class));
		  System.out.println(context.getBean(PrototypeClass.class));

/*
 
 So by default, all the beans that are created in spring framework are singletons.
 whenever we ask for a bean, the same instance would be returned back.
 
 if we want a different instance to be created each time a bean is referred to in that kind
of scenario, we can go for prototype.
 */
		} 

	}

}
