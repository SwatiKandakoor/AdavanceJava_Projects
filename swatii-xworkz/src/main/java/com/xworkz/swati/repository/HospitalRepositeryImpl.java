package com.xworkz.swati.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.swati.entity.HospitalEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class HospitalRepositeryImpl implements HospitalRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public HospitalRepositeryImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(HospitalEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public HospitalEntity findByid(int id) {
		log.info("find by id in repo.." + id);
		EntityManager entitymanager = this.entityManagerFactory.createEntityManager();
		HospitalEntity fromDb = entitymanager.find(HospitalEntity.class, id);
		entitymanager.close();
		return fromDb;
	}

	@Override
	public List<HospitalEntity> findByName(String name) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("hospName", name);
			List<HospitalEntity> list = query.getResultList();
			log.info("Total List found in repo.." + list.size());
//			for (int i = 0; i < list.size(); i++) {
//				log.info(list.get(i));

			return list;

		} finally {
			manager.close();
		}

	}

	@Override
	public boolean update(HospitalEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		// Decide
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

	@Override
	public boolean deleteById(int id) {
		log.info("running deleteby id in repo...");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		HospitalEntity entity = manager.find(HospitalEntity.class, id);
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(entity);
			transaction.commit();
			return true;

		} finally {
			manager.close();
		}
	}

	@Override
	public List<HospitalEntity> findAll() {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAll");
			List<HospitalEntity> list = query.getResultList();
			log.info("Total List found in repo.." + list.size());

			return list;

		} finally {
			manager.close();

		}
	}

	@Override
	public List<HospitalEntity> findByTwoProp(String name, int fees) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByTwoProp");
			query.setParameter("hospName", name);
			query.setParameter("hospFees", fees);
			List<HospitalEntity> list = query.getResultList();
			log.info("Total List found in repo.." + list.size());
			return list;

		} finally {
			manager.close();
		}

	}

}
