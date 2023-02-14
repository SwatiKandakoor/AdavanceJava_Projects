package com.xworkz.valentine.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.valentine")
public class ValentineConfiguration {
	public ValentineConfiguration() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

//	public ViewResolver resolver() {
//		System.out.println("registering viewResolver...");
//		return new InternalResourceViewResolver("/", ".jsp");
//	}

}
