package com.practice.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {

	@Bean
	public String name() {
		return "Kushal";
	}
	
	@Bean
	public int age()
	{
	return 28;	
	}
	
	@Bean // thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'employee' available
	public Employee employee()
	{
		return new Employee(1,"Tanay Saxena",28);
	}
	
	
	@Bean(name = "employee2")
	@Primary
	public Employee employeeData()
	{
		return new Employee(2,"Vinay Sharma",18);
	}
	
	
	@Bean
	public Person person()
	{
		return new Person(3,"Rajat Malhotra",38);
	}

	
	@Bean(name="address2")
	@Primary
	public Address address2()
	{
		return new Address("A55 Sector 36","Nithari Golf Course");
	}
	
	@Bean(name="address")
	@Qualifier("addressQualify")
	public Address address()
	{
		return new Address("Sky Resdiency","RaniBagh Main");
	}
	
	@Bean(name="student2methodCall")
	public Student student2methodCall()
	{
		return new Student(2, name(), age(),address());
	}
	
	@Bean(name="student3methodCall")
	public Student student3methodCall(String name,int age,Address address2)
	{
		return new Student(2, name, age,address2);
	}
	
	@Bean(name="student4methodCall")
	public Student student4QualifierMethodCall(String name,int age,@Qualifier("addressQualify") Address address)
	{
		return new Student(2, name, age,address);
	}
}
