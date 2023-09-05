package com.practice;

import com.practice.dto.Brand;
import com.practice.dto.FaceEquipment;
import com.practice.dto.Mobile;

//@SpringBootApplication
public class SFApproach1Application {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringFramework6Application.class, args);
		var brand=new Brand(1L,"Samsung");
		var mobile=new Mobile(1L,"Samsung A73",42000L,brand);
		Runner runner = new Runner(mobile);
		
		runner.run();
		
		
		var brand2=new Brand(2L,"Bajaj");
		var bajaj=new FaceEquipment(1L,"Bajaj Hairoil",110L,brand2);
		Runner runner2 = new Runner(bajaj);
		runner2.run();
			
	}

}
