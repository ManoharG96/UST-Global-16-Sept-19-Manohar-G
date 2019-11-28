package com.ustglobal.jpawithhibernate.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateJPQL {
	public static void main(String[] args) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			//String jpql = "update ProductInfo set pName = 'Penciles' where pId=2 ";//updating the data
			String jpql = "delete from ProductInfo where pId=2";
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Query result = entityManager.createQuery(jpql);
			int count = result.executeUpdate();
			//System.out.println("Recorded updated "+count);
			System.out.println("Deleted the recorded "+count);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
