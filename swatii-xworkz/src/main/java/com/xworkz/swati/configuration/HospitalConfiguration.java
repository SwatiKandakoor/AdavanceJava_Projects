package com.xworkz.swati.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.swati")
@Slf4j
public class HospitalConfiguration {

	public HospitalConfiguration() {
		log.info("create " + this.getClass().getSimpleName());
	}

	@Bean
	public MultipartResolver multipartResolver() {
		log.info("registering multipartResolver");
		return new StandardServletMultipartResolver();

	}

	@Bean
	public ViewResolver viewResolver() {
		log.info("viewResolver ");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();

	}

}