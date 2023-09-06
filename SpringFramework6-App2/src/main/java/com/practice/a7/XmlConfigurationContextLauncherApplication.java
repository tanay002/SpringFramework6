package com.practice.a7;

import java.util.Arrays;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.a0.Runner;
import com.practice.a0.Mobile;

@Configuration
@ComponentScan()
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);

			System.out.println(context.getBean("name"));

			System.out.println(context.getBean("age"));

			context.getBean(Runner.class).run();
			
			context.getBean(Mobile.class).fetchDetails();

		}
	}

}
