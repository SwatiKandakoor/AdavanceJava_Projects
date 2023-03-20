package com.xworkz.swati.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.swati.entity.HospitalEntity;

import lombok.extern.slf4j.Slf4j;

public interface HospitalRepository {

	boolean save(HospitalEntity entity);

	boolean update(HospitalEntity entity);

	boolean deleteById(int id);
	
	
	default HospitalEntity findByid(int id) {
		return null;
	}

	default List<HospitalEntity> findByName(String name) {
		return Collections.emptyList();
	}
	
	default List<HospitalEntity> findAll() {
		return Collections.emptyList();
	}
	
	default List<HospitalEntity> findByTwoProp(String name,int fees) {
		return Collections.emptyList();
	}

}
