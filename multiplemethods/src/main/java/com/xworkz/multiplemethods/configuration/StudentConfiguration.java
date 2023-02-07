package com.xworkz.multiplemethods.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.multiplemethods")
public class StudentConfiguration {

	public StudentConfiguration() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

}
