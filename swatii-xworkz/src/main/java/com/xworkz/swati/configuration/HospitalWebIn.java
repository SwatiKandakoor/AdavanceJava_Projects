package com.xworkz.swati.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

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

	@Override
	protected void customizeRegistration(Dynamic registration) {
		String tempDir = "D:\\temp";
		int maxUploadSizeInMb = 6 * 1024 * 1024;
		File uploadDirectory = new File(tempDir);
		MultipartConfigElement element = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);
		registration.setMultipartConfig(element);

	}

}
