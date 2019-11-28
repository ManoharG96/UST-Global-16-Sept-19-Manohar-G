package com.ustglobal.jpawithhibernate.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateJPQL {
	
	public static void main(String[] args) {
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			String jpql = "update ProductInfo set pName=:name where pId=:id";
			
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			Query result = entityManager.createQuery(jpql);
			result.setParameter("name", "LaptopsBags");
			result.setParameter("id", 3);
			
			int count = result.executeUpdate();
			System.out.println("Updated the recorded "+count);
			
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
