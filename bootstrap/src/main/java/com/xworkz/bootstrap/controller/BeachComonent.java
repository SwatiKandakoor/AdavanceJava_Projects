package com.xworkz.bootstrap.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bootstrap.dto.BeachDto;

@Component
@RequestMapping("/beach")
public class BeachComonent {
	public BeachComonent() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(BeachDto dto) {
		System.out.println("running post mapping...");
		System.out.println("Beach dto :" + dto);
		return "beach.jsp";
	}

}
