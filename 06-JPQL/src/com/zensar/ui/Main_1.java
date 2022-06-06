package com.zensar.ui;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import com.zensar.bean.Doctor;
import com.zensar.util.JPAUtil;

public class Main_1 {

	public static void main(String[] args) {
		Doctor doctor1 = new Doctor("Paramesh", 500, "MALE", LocalDate.of(2021, 12, 25));
		Doctor doctor2 = new Doctor("Bhanu Prakash", 1000, "MALE", LocalDate.of(2022, 5, 23));
		Doctor doctor3 = new Doctor("Raja Gopal", 800, "MALE", LocalDate.of(1998, 2, 20));
		Doctor doctor4 = new Doctor("Neelima", 600, "FEMALE", LocalDate.of(2018, 6, 18));
		Doctor doctor5 = new Doctor("Swetha", 800, "FEMALE", LocalDate.of(2000, 1, 22));

		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		em.persist(doctor1);
		em.persist(doctor2);
		em.persist(doctor3);
		em.persist(doctor4);
		em.persist(doctor5);

		em.getTransaction().commit();
		JPAUtil.shutDown();

		System.out.println("Doctor Data Saved ");
	}
}