package com.ustglobal.jpawithhibernate.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertJPQL {
	public static void main(String[] args) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "insert into ProductInfo pId:id pName:name pQuantity:quantity";
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Query result = entityManager.createQuery(jpql);
			result.setParameter("id", 2);
			result.setParameter("name", "PlayStations");
			result.setParameter("quantity", 05);
			int count = result.executeUpdate();
			System.out.println("inserted the record "+count);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
