package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class InsertDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		ProductInfo info = new ProductInfo();
		info.setpId(2);
		info.setpName("ColorPenciles");
		info.setpQuantity(25);
		
		entityManager.persist(info);
		entityTransaction.commit();
		System.out.println("Recorded added");
		entityManager.close();
	}
}
