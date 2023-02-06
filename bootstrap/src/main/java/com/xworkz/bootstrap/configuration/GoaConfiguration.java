package com.xworkz.bootstrap.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bootstrap")
public class GoaConfiguration {
	public GoaConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

}
