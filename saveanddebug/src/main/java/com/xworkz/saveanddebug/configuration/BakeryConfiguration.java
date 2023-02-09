package com.xworkz.saveanddebug.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.saveanddebug")
public class BakeryConfiguration {
	public BakeryConfiguration() {
		System.out.println("create " + this.getClass().getSimpleName());

	}
}
