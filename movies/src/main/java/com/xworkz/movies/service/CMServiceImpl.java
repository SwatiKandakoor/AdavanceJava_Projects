package com.xworkz.movies.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.movies.dto.CMDto;

@Service
public class CMServiceImpl implements CMService {

	@Override
	public Set<ConstraintViolation<CMDto>> validateAndSave(CMDto cmdto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMDto>> constraintViolations = validator.validate(cmdto);
		validator.validate(cmdto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exist,return constraintViolations");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist, data is good");
		}

		return Collections.emptySet();
	}

}
