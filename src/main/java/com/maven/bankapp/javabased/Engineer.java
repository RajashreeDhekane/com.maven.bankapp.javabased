package com.maven.bankapp.javabased;

import org.springframework.stereotype.Component;

@Component
public class Engineer implements Employee {

	public String work() {
		return "Engineer start work....";
		
	}
}
