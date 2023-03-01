package com.xworkz.swati.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.swati.entity.HospitalEntity;

public interface HospitalRepository {

	boolean save(HospitalEntity entity);

	default HospitalEntity findByid(int id) {
		return null;
	}

	default List<HospitalEntity> findByName(String name) {
		return Collections.emptyList();
	}

}
