package com.practice.configuration;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationToBeanConfiguration 
{
public static void main(String[] args) {
	
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class)) {
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("employee"));
		
		System.out.println(context.getBean("employee2"));
		
		//We can get bean byType as well
		// NoUniqueBeanDefinitionException as we have declared 2 bean of employee class
		//By resolving this issue we have to make one of the bean primary
		System.out.println(context.getBean(Employee.class));

		// byType
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
		
		
		System.out.println(context.getBean("student2methodCall"));
		System.out.println(context.getBean("student3methodCall"));
		
		
		//Qualifier 
		System.out.println("Qualifier "+context.getBean("student4methodCall"));
		
		// Listed All Beans managed by Spring Framework
		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}
}
