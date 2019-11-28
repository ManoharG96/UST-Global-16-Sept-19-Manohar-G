package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.oneToOneMapping.PersonDetails;
import com.ustglobal.jpawithhibernate.oneToOneMapping.VoterCardDetails;

public class TestOneToOneMapping {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		
		VoterCardDetails cardDetails = new VoterCardDetails();
		cardDetails.setVId(124);
		cardDetails.setVName("V Rama");
		
		PersonDetails details = new PersonDetails();
		details.setCDetails(cardDetails);
		details.setPName("Rama V");
		details.setPId("12");
		
		entityManager.persist(details);
		entityTransaction.commit();
		System.out.println("Recorded added");
		entityManager.close();
	}
}
