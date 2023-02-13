package com.xworkz.movies.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.movies.dto.MoviesDto;

@Repository
public class MoviesRepositoryImpl implements MoviesRepository {
	@Autowired
	 EntityManagerFactory entityManagerFactory;

	public MoviesRepositoryImpl() {
		System.out.println("create " + this.getClass().getSimpleName());

	}

	@Override
	public boolean save(MoviesDto dto) {
		System.out.println("running  save in movies repo....");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return false;
	}

}
