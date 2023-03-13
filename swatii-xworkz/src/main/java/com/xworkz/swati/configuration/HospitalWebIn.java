package com.xworkz.swati.configuration;

import org.springframework.web
.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HospitalWebIn extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public HospitalWebIn() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running in getRootConfigClasses");
		return null;
	}
	// Registering the Spring config file
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running in getServletConfigClasses");
		return new Class[] { HospitalConfiguration.class };
	}
      // Add mapping url
	@Override
	protected String[] getServletMappings() {
		System.out.println("Running in getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}

}
