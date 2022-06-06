package com.zensar.ui;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.zensar.bean.Doctor;
import com.zensar.util.JPAUtil;

public class Main_2 {

	// Read All
	static void test1() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");

		TypedQuery<Doctor> query = em.createNamedQuery("findAll", Doctor.class);
		List<Doctor> doctors = query.getResultList();
		System.out.println(doctors);
		
		JPAUtil.shutDown();
	}

	// Read Select Id
	static void test2() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");

		TypedQuery<Doctor> query = em.createNamedQuery("findById", Doctor.class);
		query.setParameter("searchId", 3);
		
		List<Doctor> doctors = query.getResultList();
		System.out.println(doctors);
		JPAUtil.shutDown();
	}

	// Update 
	static void test3() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		Query query = em.createNamedQuery("updateFees");

		System.out.println(query.executeUpdate());

		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		// test1();
		// test2();
		test3();
	}
}