package com.xworkz.swati.controller;

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

import com.xworkz.swati.dto.HospitalDto;
import com.xworkz.swati.service.HospitalService;

@Controller
@RequestMapping("/")
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;

	public HospitalController() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	private List<String> specialists = Arrays.asList("cardiologist", "chiropractor", "dentist", "dermatologist",
			"gynecologist");

	@GetMapping("/hosp")
	public String getRegister(Model model) {
		System.out.println("running in getMapping ");
		model.addAttribute("specialist", specialists);
		return "Register";
	}

	@PostMapping("/hosp")
	public String postRegister(Model model, HospitalDto

	dto) {
		System.out.println("running post ");
		Set<ConstraintViolation<HospitalDto>> violation = this.hospitalService.validateAndSave(dto);
		if (violation.isEmpty()) {
			System.out.println(" no Violation in controller");
			model.addAttribute("message", "Data Saved Sucessfully");
			model.addAttribute("specialist", specialists);
			return "Register";

		}
		model.addAttribute("specialist", specialists);
		model.addAttribute("errors", violation);
		model.addAttribute("messag", "Data is not Saved");
		return "Register";

	}

	@GetMapping("/Search")
	public String getSearch(Model model, @RequestParam int id) {

		HospitalDto adto = this.hospitalService.findByid(id);
		if (adto != null) {
			model.addAttribute("dto", adto);
		} else {
			model.addAttribute("mesage", "Do not found ");
		}
		return "search";
	}

	@GetMapping("/searchbyname")
	public String onSearchName(@RequestParam String name, Model model) {
		System.out.println("running onSearchName controller " + name);
		List<HospitalDto> list = this.hospitalService.findByName(name);
		model.addAttribute("list", list);

		return "SearchName";

	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("running onupdate.." + id);
		HospitalDto dto = this.hospitalService.findByid(id);
		model.addAttribute("dto", dto);
		model.addAttribute("specialist", specialists);
		return "UpdateHospital";

	}

	@PostMapping("/update")
	public String onUpdate(HospitalDto dto, Model model) {
		System.out.println("running onupdate " + dto);
		Set<ConstraintViolation<HospitalDto>> constraintViolations = this.hospitalService.validateAndUpdate(dto);
		if (constraintViolations.size() > 0) {
			model.addAttribute("error", constraintViolations);

		} else {
			model.addAttribute("message", "Hospital update success...");
		}
		return "UpdateHospital";
	}

	@GetMapping("/delete")
	public String onDelete(Model model, @RequestParam int id) {
		boolean dto = this.hospitalService.deleteById(id);
		model.addAttribute("message", "delete was successful");
		return "Delete";
	}

}
