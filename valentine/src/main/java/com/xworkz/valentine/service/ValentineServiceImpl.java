package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDto;

@Service
public class ValentineServiceImpl implements ValentineService {
	public ValentineServiceImpl() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation in dto " + dto);
			return violations;
		} else {
			System.out.println("violation is not there in dto, can save");
			return Collections.emptySet();
		}

	}

}
