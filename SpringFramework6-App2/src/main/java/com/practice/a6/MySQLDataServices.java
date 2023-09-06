package com.practice.a6;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataServices implements DataService {

	@Override
	public int[] retrieveData() {
		return new int [] {23,45,67,21,35,54};
	}

}
