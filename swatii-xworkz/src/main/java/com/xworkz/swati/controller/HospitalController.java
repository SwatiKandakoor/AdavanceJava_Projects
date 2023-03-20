package com.xworkz.swati.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.swati.dto.HospitalDto;
import com.xworkz.swati.service.HospitalService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;

	public HospitalController() {
		log.info("create " + this.getClass().getSimpleName());
	}

	private List<String> specialists = Arrays.asList("cardiologist", "chiropractor", "dentist", "dermatologist",
			"gynecologist");

	@GetMapping("/hosp")
	public String getRegister(Model model) {
		log.info("running in getMapping ");
		model.addAttribute("specialist", specialists);
		return "Register";
	}

	@PostMapping("/hosp")
	public String postRegister(Model model, HospitalDto dto) {
		log.info("running post ");
		Set<ConstraintViolation<HospitalDto>> violation = this.hospitalService.validateAndSave(dto);
		if (violation.isEmpty()) {
			log.info(" no Violation in controller");
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
		log.info("running onSearchName controller " + name);
		List<HospitalDto> list = this.hospitalService.findByName(name);
		model.addAttribute("list", list);

		return "SearchName";

	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		log.info("running onupdate.." + id);
		HospitalDto dto = this.hospitalService.findByid(id);
		model.addAttribute("dto", dto);
		model.addAttribute("specialist", specialists);
		return "UpdateHospital";

	}

	@PostMapping("/update")
	public String onUpdate(HospitalDto dto, Model model) {
		log.info("running onupdate " + dto);
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

	@GetMapping("/searchByTwoProp")
	public String onSearchByTwoProp(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "fees", required = false) int fees, Model model) {

		log.info("running onSearchName controller " + name);
		List<HospitalDto> list = this.hospitalService.findByTwoProp(name, fees);
		model.addAttribute("list", list);

		return "SearchByTwoProp";

	}

	@GetMapping("/findAll")
	public String getSearch(Model model) {

		List<HospitalDto> dto = this.hospitalService.findAll();
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("mesage", "Do not found ");
		}
		return "FindAll";
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("chitra") MultipartFile file) throws IOException {
		log.info("MultipartFile " + file);
		log.info(file.getOriginalFilename());
		log.info(file.getContentType());
		log.info(file.getSize());
		log.info(file.getBytes());

		byte[] bytes = file.getBytes();
		Path path = Paths.get("D:\\hospital-file\\" + file.getOriginalFilename());
		Files.write(path, bytes);
		return "ImageUpload";
	}

	@GetMapping("/download")
	public String onDownload(HttpServletResponse response, @RequestParam(value="fileName") String fileName) throws IOException {
		response.setContentType("image/jpg");
		File file = new File("D:\\hospital-file\\" + fileName);
		// file into bytes--->response
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();
		return "DownloadImage";
	}

}
