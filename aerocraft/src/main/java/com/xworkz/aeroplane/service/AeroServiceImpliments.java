package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroDTO;
import com.xworkz.aeroplane.entity.AeroEntity;
import com.xworkz.aeroplane.repositery.AeroRepositery;

@Service
public class AeroServiceImpliments implements AeroService {
	@Autowired
	private AeroRepositery repositery;

	public AeroServiceImpliments() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroDTO>> validateAndSave(AeroDTO adto) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<AeroDTO>> constraintViolations = validator.validate(adto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exists,return constraints");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist,data is good");
			AeroEntity aentity = new AeroEntity();
			aentity.setCompany(adto.getCompany());
			aentity.setCost(adto.getCost());
			aentity.setCountry(adto.getCountry());
			aentity.setName(adto.getName());
			aentity.setType(adto.getType());
			boolean saved = this.repositery.save(aentity);
			System.out.println(saved);
			System.out.println("DTO" + adto);
			System.out.println("ENTITY" + aentity);
			return Collections.emptySet();
		}

	}

	@Override
	public AeroDTO findByid(int id) {
		if (id > 0) {
			AeroEntity aentity = this.repositery.findByid(id);
			if (aentity != null) {
				AeroDTO dto = new AeroDTO();
				dto.setCompany(aentity.getCompany());
				dto.setCost(aentity.getCost());
				dto.setCountry(aentity.getCountry());
				dto.setName(aentity.getName());
				dto.setType(aentity.getType());
				dto.setId(aentity.getId());
				return dto;
			}
		}
		return AeroService.super.findByid(id);

	}

}
