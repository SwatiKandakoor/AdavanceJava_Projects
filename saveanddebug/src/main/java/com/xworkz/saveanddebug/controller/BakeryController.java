package com.xworkz.saveanddebug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.saveanddebug.dto.BakeryDto;
import com.xworkz.saveanddebug.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {
	@Autowired
	 private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@PostMapping("/bakery")
	public String onBakery(BakeryDto dto, Model model) {
		System.out.println("running get onBakery....");
		model.addAttribute("name",dto.getName());
		model.addAttribute("ownerName",dto.getOwnerName());
		model.addAttribute("wifeName",dto.getWifeName());
		model.addAttribute("married",dto.isMarried());
		model.addAttribute("famousFor",dto.getFamousFor());

		System.out.println("name:"+dto.getName());
		System.out.println("ownerName :"+dto.getOwnerName());
		System.out.println("wifeName :"+dto.getWifeName());
		System.out.println("married :" +dto.isMarried());
		System.out.println("famousFor :"+dto.getFamousFor());
		System.out.println("since :" +dto.getSince());
		boolean saved=this.bakeryService.saveAndValidation(dto);
		System.out.println("saved :"+saved);
		return "bakerysuccess.jsp";

	}
}
