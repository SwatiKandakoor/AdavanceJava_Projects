package com.xworkz.saveanddebug.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInti extends AbstractAnnotationConfigDispatcherServletInitializer {
	public WebInti() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getRootConfigClasses");
		Class[] ref = { BakeryConfiguration.class };
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getRootConfigClasses");
		return new String[] { "/" };
	}
    
}
