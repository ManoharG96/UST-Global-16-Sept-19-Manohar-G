package com.ustglobal.jpawithhibernate.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteJPQL {
	public static void main(String[] args) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "delete from ProductInfo where pId=:id";
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Query result = entityManager.createQuery(jpql);
			result.setParameter("id", 1);
			int count = result.executeUpdate();
			System.out.println("Deleted the recorded "+count);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
