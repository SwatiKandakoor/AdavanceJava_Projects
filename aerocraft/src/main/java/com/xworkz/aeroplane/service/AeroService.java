package com.xworkz.aeroplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplane.dto.AeroDTO;

public interface AeroService {
	Set<ConstraintViolation<AeroDTO>> validateAndSave(AeroDTO adto);
	
	default AeroDTO findByid(int id) {
		return null;
	}

}
