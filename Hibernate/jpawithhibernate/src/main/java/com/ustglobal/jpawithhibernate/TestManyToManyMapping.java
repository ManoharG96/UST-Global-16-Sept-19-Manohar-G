package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manyToManyMapping.CourseDetails;
import com.ustglobal.jpawithhibernate.manyToManyMapping.StudentDetails;

public class TestManyToManyMapping {

	public static void main(String[] args) {

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();

			CourseDetails cdetails = new CourseDetails();
			cdetails.setCId(123);
			cdetails.setCName("EEE");
			CourseDetails cdetails1 = new CourseDetails();
			cdetails1.setCId(456);
			cdetails1.setCName("EC");
			CourseDetails cdetails2 = new CourseDetails();
			cdetails2.setCId(789);
			cdetails2.setCName("Civil");

			ArrayList<CourseDetails> cAdd = new ArrayList<CourseDetails>();
			cAdd.add(cdetails);
			cAdd.add(cdetails1);
			cAdd.add(cdetails2);

			StudentDetails sDetails = new StudentDetails();
			sDetails.setSId(147);
			sDetails.setSName("Munna");
			sDetails.setCDetails(cAdd);

			entityManager.persist(sDetails);
			entityTransaction.commit();
			System.out.println("Recorded Added");
			entityManager.close();

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
