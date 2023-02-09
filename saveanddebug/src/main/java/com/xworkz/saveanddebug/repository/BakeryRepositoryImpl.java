package com.xworkz.saveanddebug.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.saveanddebug.dto.BakeryDto;
@Repository
public class BakeryRepositoryImpl implements BakeryRepository {
	

	@Override
	public boolean save(BakeryDto dto) {
		System.out.println("running bakeryrepository...");
		
		return false;
	}

}
