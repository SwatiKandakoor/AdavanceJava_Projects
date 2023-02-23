package com.xworkz.aeroplane.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroDTO;
import com.xworkz.aeroplane.service.AeroService;

@Controller
@RequestMapping("/")
public class AeroController {
	@Autowired
	private AeroService aeroService;

	public AeroController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	private List<String> types = Arrays.asList("Comercial", "Busines", "Cargo", "Difence", "Private");
	private List<String> countries = Arrays.asList("Bharath", "USA", "UAE", "Singpoore", "Maleshiya");

	@GetMapping("/aero")
	public String getRegister(Model model) {
		System.out.println("running in getMapping ");
		model.addAttribute("type", types);
		model.addAttribute("country", countries);
		return "Register";
	}

	@PostMapping("/aero")
	public String postRegister(Model model, AeroDTO adto) {
		Set<ConstraintViolation<AeroDTO>> violation = this.aeroService.validateAndSave(adto);
		if (violation.isEmpty()) {
			System.out.println(" no Violation in controller");
			model.addAttribute("message", "Data Saved Sucessfully");
			model.addAttribute("type", types);
			model.addAttribute("country", countries);
			return "Register";

		}
		model.addAttribute("type", types);
		model.addAttribute("country", countries);
		model.addAttribute("errors", violation);
		model.addAttribute("messag", "Data is not Saved");
		return "Register";

	}

	@GetMapping("/Search")
	public String getSearch(Model model, @RequestParam int id) {

		AeroDTO adto = this.aeroService.findByid(id);
		if (adto != null) {
			model.addAttribute("dto", adto);
		} else {
			model.addAttribute("mesage", "Do not found ");
		}
		return "search";
	}

}
