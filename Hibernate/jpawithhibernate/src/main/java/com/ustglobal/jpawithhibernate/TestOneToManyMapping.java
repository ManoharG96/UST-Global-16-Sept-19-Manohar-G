package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.oneToManyMapping.PencilBox;
import com.ustglobal.oneToManyMapping.PencilDetails;

public class TestOneToManyMapping {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		
		PencilBox pencilBox = new PencilBox();
		pencilBox.setBId(1);
		pencilBox.setBName("NataRaj");
		
		PencilDetails pencilDetails = new PencilDetails();
		pencilDetails.setPColor("Black");
		pencilDetails.setPId(5);
		pencilDetails.setPencilBox(pencilBox);
		
		entityManager.persist(pencilDetails);
		entityTransaction.commit();
		System.out.println("Recorded Added");
		entityManager.close();

	}

}
