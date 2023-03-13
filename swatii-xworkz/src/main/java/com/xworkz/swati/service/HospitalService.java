package com.xworkz.swati.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.swati.dto.HospitalDto;

public interface HospitalService {
	Set<ConstraintViolation<HospitalDto>> validateAndSave(HospitalDto dto);

	Set<ConstraintViolation<HospitalDto>> validateAndUpdate(HospitalDto dto);
		
	boolean deleteById(int id);

	default HospitalDto findByid(int id) {
		return null;
	}

	

	default List<HospitalDto> findByName(String name) {
		return Collections.emptyList();
	}
	default List<HospitalDto> findByTwoProp(String name,int fees) {
		return Collections.emptyList();
	}
	
	default List<HospitalDto> findAll(){
		return Collections.emptyList();
	}


}
