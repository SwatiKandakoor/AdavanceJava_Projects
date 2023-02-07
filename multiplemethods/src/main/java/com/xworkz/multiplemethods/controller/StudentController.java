package com.xworkz.multiplemethods.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.multiplemethods.dto.BeverageDto;
import com.xworkz.multiplemethods.dto.ChatsDto;
import com.xworkz.multiplemethods.dto.EductionDto;
import com.xworkz.multiplemethods.dto.FamilyDto;
import com.xworkz.multiplemethods.dto.TeliphoneDto;

@Component
@RequestMapping("/")
public class StudentController {
	public StudentController() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@GetMapping("/mail")
	public String onEmail(Model model) {
		System.out.println("running onEmail...");
		model.addAttribute("email", "swatikandakoor06@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onPhone(Model model) {
		System.out.println("running onMobile..");
		model.addAttribute("phone", "9980361822");
		return "index.jsp";
	}

	@GetMapping("/adhar")
	public String onAadhar(Model model) {
		System.out.println("running onAadhar...");
		model.addAttribute("aadhar", "9210433678");
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("running onAge...");
		model.addAttribute("aage", "24");
		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDob(Model model) {
		System.out.println("running onDob...");
		model.addAttribute("dob", LocalDateTime.of(1998, 06, 28, 6, 2));
		return "index.jsp";
	}

	@GetMapping("/sal")
	public String onDesiredSal(Model model) {
		System.out.println("running onDesiredSal...");
		model.addAttribute("salary", "30000");
		return "index.jsp";
	}

	@GetMapping("/best")
	public String onBestFrnd(Model model) {

		System.out.println("running onBestFrnd... ");
		List<String> l1 = new ArrayList();
		l1.add("Rashi");
		l1.add("Vani");
		l1.add("Sahana");
		l1.add("Nayana");
		model.addAttribute("bestfrnd", l1);
		return "index.jsp";

	}

	@GetMapping("/places")
	public String onPlaces(Model model) {

		System.out.println("running onPlaces... ");
		List<String> list = new ArrayList();
		list.add("Udapi");
		list.add("Bangaluru");
		list.add("Mysore");
		list.add("Chitradurga");
		model.addAttribute("visitedplaces", list);
		return "index.jsp";

	}

	@GetMapping("/skill")
	public String onSkills(Model model) {

		System.out.println("running onSkills... ");
		List<String> list = new ArrayList();
		list.add("Java");
		list.add("SQL");
		list.add("HTML");
		list.add("CSS");
		model.addAttribute("skillset", list);
		return "index.jsp";

	}

	@GetMapping("/eduction")
	public String onEduction(Model model) {
		System.out.println("running onEduction...");
		EductionDto dto = new EductionDto();
		dto.setId(1);
		dto.setName("Naveen");
		dto.setPhoneNo(8073982483d);
		dto.setAddress("ilkal");
		dto.setFees(30000);
		dto.setBright(true);
		dto.setAddarNo(45678909876d);
		dto.setBranch("Bcom");
		dto.setTotalStds(40);
		dto.setTotalClasses(10);
		model.addAttribute("eductiondetl", dto);
		return "index.jsp";
	}

	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("running onFamily....");
		FamilyDto dto = new FamilyDto();
		dto.setFamilyName("Arasu");
		dto.setTotalmembers(4);
		dto.setHeadName("Nagaraddi");
		dto.setFatherName("Nagaraddi");
		dto.setWifeName("kavitha");
		dto.setSonName("Naveen");
		dto.setDougtherName("Swati");
		dto.setProperty(9);
		dto.setPropertyPrice(20000000);
		dto.setGrandMotherName("Sobhagyhamma");
		model.addAttribute("family", dto);
		return "index.jsp";
	}

	@GetMapping("/phone")
	public String onMobile(Model model) {
		System.out.println("running onMobile...");
		TeliphoneDto dto = new TeliphoneDto();
		dto.setName("Redmi");
		dto.setPrice(20000);
		dto.setWarranty(1);
		dto.setRam(64);
		dto.setCountry("China");
		model.addAttribute("mobile", dto);
		return "index.jsp";
	}

	@GetMapping("/beverage")
	public String onBeverage(Model model) {
		System.out.println("running onBeverage..");
		BeverageDto dto = new BeverageDto();
		dto.setName("Coffee");
		dto.setPrice(10);
		dto.setType("hotCoffee");
		dto.setHealthy(true);
		dto.setBrand("Bru");
		dto.setMadeOf("plantation and Robusta beans");
		dto.setSugar(true);
		dto.setQuntity(1);
		model.addAttribute("coffee", dto);
		return "index.jsp";

	}

	@GetMapping("/chats")
	public String onChats(Model model) {
		System.out.println("running onChats..");
		ChatsDto dto = new ChatsDto();
		dto.setName("Gobi");
		dto.setPrice(60);
		dto.setQuntity(1);
		dto.setOil(false);
		dto.setHealthy(false);
		dto.setTaste(true);
		dto.setTotal(1);
		dto.setShopName("Lakshmi");
		dto.setLocation("bangalore");
		dto.setShopclean(true);
		dto.setMd(2023);
		model.addAttribute("chat", dto);
		return "index.jsp";

	}
}
