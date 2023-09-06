package com.practice.a6;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
public class BusinessCalculationService {

	private DataService dataService;



	public DataService getDataService() {
		return dataService;
	}

	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection...");
		this.dataService = dataService;
	}



	public int findMax()
	{
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
