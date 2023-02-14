package com.xworkz.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.movies.dto.MoviesDto;
import com.xworkz.movies.repository.MoviesRepository;

@Service
public class MoviesServiceImpl implements MoviesService {
	@Autowired
	private MoviesRepository moviesRepository;

	public MoviesServiceImpl() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validationAndSave(MoviesDto dto) {
		System.out.println("check validation  and save...");
		boolean saved = this.moviesRepository.save(dto);
		System.out.println("saved :" + saved);
		return false;
	}

}
