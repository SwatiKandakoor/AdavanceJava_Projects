package com.xworkz.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.movies.dto.MoviesDto;
import com.xworkz.movies.service.MoviesService;

@Controller
@RequestMapping("/movie")
public class MoviesController {
	@Autowired
	private MoviesService moviesService;

	public MoviesController() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@PostMapping()
	public String onMovies(MoviesDto moviesDto, Model model) {
		System.out.println("running post on movies...");
		System.out.println("Movies dto :"+moviesDto);
		model.addAttribute("Movies dto :" + moviesDto);
		boolean saved=this.moviesService.validationAndSave(moviesDto);
		System.out.println("saved :"+saved);
		return "Movies.jsp";
	}
}
