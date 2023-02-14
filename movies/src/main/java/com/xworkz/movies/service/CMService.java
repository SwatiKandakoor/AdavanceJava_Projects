package com.xworkz.movies.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.movies.dto.CMDto;

public interface CMService {
	Set<ConstraintViolation<CMDto>> validateAndSave(CMDto cmdto);

}
