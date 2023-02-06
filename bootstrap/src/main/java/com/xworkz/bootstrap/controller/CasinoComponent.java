package com.xworkz.bootstrap.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bootstrap.dto.CasinoDto;

@Component
@RequestMapping("/casi")
public class CasinoComponent {
	public CasinoComponent() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

@PostMapping
public String onSend(CasinoDto dto,Model model){
	System.out.println("running post mapping...");
	System.out.println("casino dto :"+dto);
	model.addAttribute("name",dto.getName());
	model.addAttribute("cruise",dto.getCruise());
	model.addAttribute("entryfee",dto.getEntryfee());
	model.addAttribute("freefood", dto.isFreefood());
	return "casinoSucces.jsp";
	
}
}
