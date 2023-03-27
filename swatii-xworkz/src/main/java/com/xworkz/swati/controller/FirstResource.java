package com.xworkz.swati.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.swati.dto.HospitalDto;
import com.xworkz.swati.service.HospitalService;

import lombok.extern.slf4j.Slf4j;
@EnableWebMvc
@RestController
@RequestMapping("/")
@Slf4j
public class FirstResource {

	@Autowired
	public HospitalService hospitalService;

	public FirstResource() {
		log.info("create " + this.getClass().getSimpleName());
	}
	
	@GetMapping(value = "/call",produces = MediaType.APPLICATION_JSON_VALUE)
	public String onCall() {
		log.info("running onCall in FirstResource");
		return "This is the data returned now ,for practise...";
		
	}

	@GetMapping(value= "/dto/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public HospitalDto onDto(@PathVariable int id) {
		log.info("running HospitalDto with id "+id);
		HospitalDto dto=hospitalService.findByid(id);
		return dto;
	}
}
