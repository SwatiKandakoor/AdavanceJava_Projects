package com.xworkz.aeroplane.repositery;

import javax.validation.groups.Default;

import com.xworkz.aeroplane.entity.AeroEntity;

public interface AeroRepositery {

	boolean save(AeroEntity aentity);

	default AeroEntity findByid(int id) {
		return null;
	}

}
