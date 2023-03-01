package com.xworkz.swati.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.swati.dto.HospitalDto;

public interface HospitalService {
	Set<ConstraintViolation<HospitalDto>> validateAndSave(HospitalDto dto);

	default HospitalDto findByid(int id) {
		return null;
	}

	default List<HospitalDto> findByName(String name) {
		return Collections.emptyList();
	}

}
