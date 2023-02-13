package com.xworkz.movies.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MoviesApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses ");
		Class[] ref = { MoviesApplicationConfiguration.class };
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings ");
		return new String[] { "/" };
	}

//	@Override
//	public String configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		System.out.println("running getRootConfigClasses ");	
//return configurer;
//		}
}
