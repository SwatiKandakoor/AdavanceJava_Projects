package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.valentine.dto.ValentineDto;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {

	@Autowired
	public ValentineService service;
	List<String> places = Arrays.asList("Temple", "Mall", "Hotels", "Shoping");
	List<String> gifts = Arrays.asList("Chacolate", "Ring", "Teddy");

	public ValentineController() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@GetMapping()
	public String onValentine(Model model) {
		System.out.println("running onValentine get method..");
		model.addAllAttributes(places);
		model.addAllAttributes(gifts);
		return "Valentine.jsp";
	}

	@PostMapping()
	public String onValentine(ValentineDto dto, Model model) {
		System.out.println("running onValentine post method..");
		Set<ConstraintViolation<ValentineDto>> violations = service.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violation in controller go to success page ");
			return "ValentineSuccess.jsp";
		}
		model.addAttribute("places",places);
		model.addAttribute("gifts",gifts);
		model.addAttribute("error",violations);
		System.err.println("violation in controller");
		return "Valentine.jsp";
	}

}
