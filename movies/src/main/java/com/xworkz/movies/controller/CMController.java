package com.xworkz.movies.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.movies.dto.CMDto;
import com.xworkz.movies.service.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {

	@Autowired
	private CMService cmService;

	public CMController() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCm(CMDto cmdto, Model model) {
		System.out.println("running onCm" + cmdto);
		Set<ConstraintViolation<CMDto>> constraintViolations = this.cmService.validateAndSave(cmdto);
		if (!constraintViolations.isEmpty()) {
			System.out.println("Validation failed,display error message");
			constraintViolations.forEach((cv) -> System.out.println(cv.getMessage()));
		} else {
			System.out.println("validation success,display success message");
		}
		return "CM.jsp";
	}
}
