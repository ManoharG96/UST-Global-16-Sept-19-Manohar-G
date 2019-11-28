package com.ustglobal.jpawithhibernate.JPQL;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class RetriveJPQL {

	public static void main(String[] args) {
		try{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			//String jpql = "from ProductInfo"; //to retrive all the information form db
			String jpql = "select pName from ProductInfo";
			Query result = entityManager.createQuery(jpql);
			List<ProductInfo> list = result.getResultList();
			//for (ProductInfo info : list) {
			//	System.out.println(info);
			//}
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
