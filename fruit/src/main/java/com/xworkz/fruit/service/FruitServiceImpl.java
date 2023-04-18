package com.xworkz.fruit.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.validation.ConstraintValidatorFactory;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.fruit.dto.FruitDto;
import com.xworkz.fruit.entity.FruitEntity;
import com.xworkz.fruit.repository.FruitRepository;

@Service
public class FruitServiceImpl implements FruitService {
	@Autowired
	private FruitRepository fruitRepository;

	public FruitServiceImpl() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<FruitDto>> validateAndSave(FruitDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FruitDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations exit data is not good");
			return violations;
		} else {
			System.out.println("violation dose not exit data is good");
			FruitEntity entity = new FruitEntity();
			// entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setColor(dto.getColor());
			entity.setPrice(dto.getPrice());
			entity.setTasty(dto.isTasty());
			boolean saved = this.fruitRepository.save(entity);
			System.out.println("saved :" + saved);
			System.out.println("dto :" + dto);
			System.out.println("entity :" + entity);
			return Collections.emptySet();
		}
	}

	@Override
	public FruitDto searchById(int id) {
		if (id > 0) {
			FruitEntity entity = this.fruitRepository.searchById(id);
			if (entity != null) {
				FruitDto dto = new FruitDto();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setTasty(entity.isTasty());
				return dto;
			}
		}
		return FruitService.super.searchById(id);
	}

	@Override
	public List<FruitDto> searchByName(String name) {
		System.out.println("running searchByName is service...");
		if (name != null && !name.isEmpty()) {
			System.out.println("name is valid...");
			List<FruitEntity> eniList = this.fruitRepository.searchByname(name);
			List<FruitDto> list = new ArrayList();
			for (FruitEntity entity : eniList) {
				FruitDto dto = new FruitDto();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setTasty(entity.isTasty());
				list.add(dto);
			}
			System.out.println("size of dtos " + list.size());
			System.out.println("size of entity " + eniList.size());
			return list;

		} else {
			System.err.println("Name is Invalid");
		}
		return FruitService.super.searchByName(name);
	}

	@Override
	public Set<ConstraintViolation<FruitDto>> validateAndUpdate(FruitDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FruitDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations exit data is not good");
			return violations;
		} else {
			System.out.println("violation dose not exit data is good");
			FruitEntity entity = new FruitEntity();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setColor(dto.getColor());
			entity.setPrice(dto.getPrice());
			entity.setTasty(dto.isTasty());
			boolean saved = this.fruitRepository.update(entity);
			System.out.println("entity :" + entity);
			return Collections.emptySet();
		}
	}
}