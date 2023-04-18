package com.xworkz.fruit.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.fruit.entity.FruitEntity;

@Repository
public class FruitRepositoryImpl implements FruitRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public FruitRepositoryImpl() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(FruitEntity entity) {
		System.out.println("running save method in repo...");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public FruitEntity searchById(int id) {
		System.out.println("running search by id....");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		FruitEntity entity = manager.find(FruitEntity.class, id);
		manager.close();
		return entity;
	}

	@Override
	public List<FruitEntity> searchByname(String name) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("byName", name);
			List<FruitEntity> list = query.getResultList();

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));

			}
			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean update(FruitEntity entity) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}

	}
}
