package com.zensar.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.zensar.bean.Person;

public class Main_1 {

	// Insert Data
	static void insert() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Intro");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Person person = new Person();
		person.setName("Ayyo Babooy");
		person.setSalary(34.00);
		// person.setName("Macha");
		// person.setSalary(44.00);

		em.persist(person);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	// Read Data
	static void load() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Intro");
		EntityManager em = emf.createEntityManager();

		Person person = em.find(Person.class, 1);

		System.out.println(person);

		// OR

		// System.out.println("employee ID = " + person.getId());
		// System.out.println("employee NAME = " + person.getName());
		// System.out.println("employee SALARY = " + person.getSalary());
		
		em.close();
		emf.close();
	}

	// Update Data
	static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Intro");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Person person = em.find(Person.class, 34.00);

		// Before Update
		System.out.println(person);
		person.setSalary(55000.00);
		em.getTransaction().commit();

		// After Update
		System.out.println(person);
		// em.merge(person);
		em.close();
		emf.close();
	}

	// Delete Data
	static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Intro");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Person person = em.find(Person.class, 2);

		em.remove(person);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		insert();
		// load();
		// update();
		// delete();
	}
}