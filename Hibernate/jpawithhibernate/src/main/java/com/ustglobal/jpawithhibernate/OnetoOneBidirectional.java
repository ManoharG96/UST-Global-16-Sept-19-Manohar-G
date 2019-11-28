package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.oneToOneMapping.PersonDetails;
import com.ustglobal.jpawithhibernate.oneToOneMapping.VoterCardDetails;

public class OnetoOneBidirectional {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		VoterCardDetails vDetails = entityManager.find(VoterCardDetails.class, 124);
		PersonDetails pDetails =  vDetails.getPDetails();

		entityManager.persist(pDetails);
		entityTransaction.commit();
		System.out.println(pDetails);
		entityManager.close();
	}
}