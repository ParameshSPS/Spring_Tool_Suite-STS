package com.zensar.ui;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import com.zensar.bean.Employee;
import com.zensar.util.JPAUtil;

public class Main_2 {

	static void insert() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		Employee emp = new Employee();

		emp.setName("Paramesh");
		emp.setDateOfJoin(LocalDate.of(2022, 03, 28));
		emp.setBasic(4.4);
		emp.setGrade('A');

		em.persist(emp);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	static void load() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");

		Employee emp = em.find(Employee.class, 1);

		System.out.println(emp);
		JPAUtil.shutDown();
	}

	static void update() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		Employee emp = em.find(Employee.class, 1);

		// Before Update
		System.out.println(emp);
		emp.setGrade('B');
		em.getTransaction().commit();

		// After Update
		System.out.println(emp);
		// em.merge(emp);
		JPAUtil.shutDown();
	}

	static void delete() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		Employee emp = em.find(Employee.class, 1);

		em.remove(emp);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		// insert();
		// load();
		// update();
		delete();
	}
}