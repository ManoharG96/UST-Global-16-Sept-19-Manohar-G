package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.oneToManyMapping.PencilBox;
import com.ustglobal.oneToManyMapping.PencilDetails;

public class OneToManyBiDirectional {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		
		PencilDetails pencilDetails = entityManager.find(PencilDetails.class, 1);
		PencilBox pencilBox = pencilDetails.getPencilBox();
		
		//entityManager.persist(pencilDetails);
		entityTransaction.commit();
		System.out.println(pencilBox);
		entityManager.close();
	}
}
