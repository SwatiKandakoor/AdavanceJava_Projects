package com.xworkz.saveanddebug.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.saveanddebug.dto.BakeryDto;
import com.xworkz.saveanddebug.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService {
	@Autowired
	private BakeryRepository bakeryRepository;

	public BakeryServiceImpl() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@Override
	public boolean saveAndValidation(BakeryDto dto) {
		System.out.println("check save and validation bakery dto...:"+dto);
		boolean saved = this.bakeryRepository.save(dto);
		System.out.println("saved :" + saved);
		return false;
	}

}
