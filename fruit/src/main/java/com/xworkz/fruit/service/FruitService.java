package com.xworkz.fruit.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.fruit.dto.FruitDto;

public interface FruitService {
	Set<ConstraintViolation<FruitDto>> validateAndSave(FruitDto dto);

	Set<ConstraintViolation<FruitDto>> validateAndUpdate(FruitDto dto);
 	
	default FruitDto searchById(int id) {
		return null;
	}

	default List<FruitDto> searchByName(String name) {
		return Collections.emptyList();
	}

}
