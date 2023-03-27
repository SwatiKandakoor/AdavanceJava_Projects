package com.xworkz.swati.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.swati.dto.HospitalDto;
import com.xworkz.swati.entity.HospitalEntity;
import com.xworkz.swati.repository.HospitalRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	private HospitalRepository repositery;

	public HospitalServiceImpl() {
		log.info("created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<HospitalDto>> validateAndSave(HospitalDto dto) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<HospitalDto>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exists,return constraints");
			return constraintViolations;
		} else {
			log.info("constraintViolations does not exist,data is good");
			HospitalEntity entity = new HospitalEntity();
			entity.setName(dto.getName());
			entity.setLocation(dto.getLocation());
			entity.setSpecialist(dto.getSpecialist());
			entity.setClean(dto.getClean());
			entity.setFees(dto.getFees());
			boolean saved = this.repositery.save(entity);
			//log.info(saved);
			log.info("Dto" + dto);
			log.info("ENTITY" + entity);
			return Collections.emptySet();
		}

	}

	@Override
	public HospitalDto findByid(int id) {
		if (id > 0) {
			HospitalEntity entity = this.repositery.findByid(id);
			if (entity != null) {
				HospitalDto dto = new HospitalDto();
				dto.setName(entity.getName());
				dto.setLocation(entity.getLocation());
				dto.setSpecialist(entity.getSpecialist());
				dto.setClean(entity.getClean());
				dto.setFees(entity.getFees());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return HospitalService.super.findByid(id);

	}

	@Override
	public List<HospitalDto> findByName(String name) {
		log.info("running findByName is service.." + name);
		if (name != null && !name.isEmpty()) {
			log.info("Name is Valid... calling repo...");
			List<HospitalEntity> entities = this.repositery.findByName(name);
			List<HospitalDto> listOfDto = new ArrayList<HospitalDto>();
			for (HospitalEntity entity : entities) {
				HospitalDto dto = new HospitalDto();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setClean(entity.getClean());
				dto.setFees(entity.getFees());
				dto.setLocation(entity.getLocation());
				dto.setSpecialist(entity.getSpecialist());
				listOfDto.add(dto);

			}
			log.info("size of dtos" + listOfDto.size());
			log.info("size of entities" + entities.size());
			return listOfDto;
		} else {
			System.err.println("Name is Invalid");
		}
		return HospitalService.super.findByName(name);

	}

	@Override
	public Set<ConstraintViolation<HospitalDto>> validateAndUpdate(HospitalDto dto) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<HospitalDto>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exists,return constraints");
			return constraintViolations;
		} else {
			log.info("constraintViolations does not exist,data is good");
			HospitalEntity entity = new HospitalEntity();
			entity.setName(dto.getName());
			entity.setLocation(dto.getLocation());
			entity.setSpecialist(dto.getSpecialist());
			entity.setClean(dto.getClean());
			entity.setFees(dto.getFees());
			entity.setId(dto.getId());
			log.info("entity:" + entity);
			boolean update = this.repositery.update(entity);
			log.info("Entity data is update :" + update);
			return Collections.emptySet();
		}
	}

	@Override
	public boolean deleteById(int id) {
		boolean deleted = this.repositery.deleteById(id);
		return true;
	}

	@Override
	public List<HospitalDto> findByTwoProp(String name, int fees) {
			List<HospitalEntity> entities = this.repositery.findByTwoProp(name, fees);
			List<HospitalDto> listOfDto = new ArrayList<HospitalDto>();
			for (HospitalEntity entity : entities) {
				HospitalDto dto = new HospitalDto();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setClean(entity.getClean());
				dto.setFees(entity.getFees());
				dto.setLocation(entity.getLocation());
				dto.setSpecialist(entity.getSpecialist());
				listOfDto.add(dto);

			}
			log.info("size of dtos" + listOfDto.size());
			log.info("size of entities" + entities.size());
			return listOfDto;
			}
		

	@Override
	public List<HospitalDto> findAll() {
		List<HospitalEntity> entities = this.repositery.findAll();
		List<HospitalDto> listOfDto = new ArrayList<HospitalDto>();
		for (HospitalEntity entity : entities) {
			HospitalDto dto = new HospitalDto();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setClean(entity.getClean());
			dto.setFees(entity.getFees());
			dto.setLocation(entity.getLocation());
			dto.setSpecialist(entity.getSpecialist());
			listOfDto.add(dto);

		}
		log.info("size of dtos" + listOfDto.size());
		log.info("size of entities" + entities.size());
		return listOfDto;
	}

}
