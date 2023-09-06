package com.practice.a0;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SFApproach2Application {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SFApproach2Application.class)) {
			context.getBean(Category.class).fetchDetails();
			
		context.getBean(Runner.class).run();
		} 
		

	}

}
