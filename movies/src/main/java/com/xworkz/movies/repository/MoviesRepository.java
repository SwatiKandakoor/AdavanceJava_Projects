package com.xworkz.movies.repository;

import com.xworkz.movies.dto.MoviesDto;

public interface MoviesRepository {

	boolean save(MoviesDto dto);

}
