package com.xworkz.valentine.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentine.dto.ValentineDto;

public interface ValentineService {

	Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto);

}
