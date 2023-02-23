package com.xworkz.aeroplane.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroEntity;
@Repository
public class AeroRepositeryImpliments implements AeroRepositery {
@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroRepositeryImpliments() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroEntity aentity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(aentity);
		transaction.commit();
		em.close();
		return true;
	}
	@Override
		public AeroEntity findByid(int id) {
		System.out.println("find by id in repo.." + id);
		EntityManager entitymanager = this.entityManagerFactory.createEntityManager();
		AeroEntity fromDb=entitymanager.find(AeroEntity.class,id);
		entitymanager.close();
		return fromDb;
		}

}
