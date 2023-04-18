package com.xworkz.fruit.repository;


import java.util.Collections;
import java.util.List;

import com.xworkz.fruit.entity.FruitEntity;

public interface FruitRepository {
   
	
	boolean save(FruitEntity entity);
	
	boolean update(FruitEntity entity);
	
	default FruitEntity searchById(int id) {
		return null;
	}
	
	default List<FruitEntity> searchByname(String name){
		return Collections.emptyList();
	}
}
