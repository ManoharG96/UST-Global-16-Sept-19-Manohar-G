package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class ReattachingDemo {
	public static void main(String[] args) {

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();
			ProductInfo productInfo = entityManager.find(ProductInfo.class,1);
			System.out.println(entityManager.contains(productInfo));
			entityManager.detach(productInfo);
			System.out.println(entityManager.contains(productInfo));
			ProductInfo productInfo1 = entityManager.merge(productInfo);
			productInfo1.setpName("paper");
			System.out.println("Record Updated");
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
