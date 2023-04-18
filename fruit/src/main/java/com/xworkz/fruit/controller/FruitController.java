package com.xworkz.fruit.controller;

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

import com.xworkz.fruit.dto.FruitDto;
import com.xworkz.fruit.service.FruitService;

@Controller
@RequestMapping("/")
public class FruitController {
	@Autowired
	
	private FruitService fruitService;

	public FruitController() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	private List<String> colors = Arrays.asList("Yellow", "Orange", "Red", "Purple", "Green", "Black");

	@GetMapping("/save")
	public String onSave(Model model) {
		System.out.println("running get onSave method");
		model.addAttribute("color", colors);
		return "Register";
	}

	@PostMapping("/save")
	public String onSave(FruitDto dto, Model model) {
		System.out.println("running post onSave method");
		Set<ConstraintViolation<FruitDto>> violations = this.fruitService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println(" no violation in controller ");
			model.addAttribute("color", colors);
			model.addAttribute("message", "Data Saved Sucessfully");

			return "Register";

		} else {
			model.addAttribute("message", "Data is not save");
			model.addAttribute("errors", violations);
			model.addAttribute("color", colors);

			return "Register";
		}
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running get onSearch by id...");
		FruitDto dto = this.fruitService.searchById(id);
		if (dto != null) {
			model.addAttribute("dto :", dto);
		} else {
			model.addAttribute("message", "Id not found");
		}
		return "SearchById";
	}

	@GetMapping("/searchbyname")
	public String onSearchByName(@RequestParam String name, Model model) {
		System.out.println("running get onSearchByName method");
		List<FruitDto> list = this.fruitService.searchByName(name);
		model.addAttribute("list", list);
		return "SearchByName";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("running onupdate.." + id);
		FruitDto dto = this.fruitService.searchById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("color", colors);
		return "Update";

	}

	@PostMapping("/update")
	public String onUpdate(FruitDto dto, Model model) {
		System.out.println("running onupdate " + dto);
		Set<ConstraintViolation<FruitDto>> constraintViolations = this.fruitService.validateAndUpdate(dto);
		if (constraintViolations.size() > 0) {
		} else {
			model.addAttribute("message", "Hospital update success...");
		}
		return "Update";
	}

}
