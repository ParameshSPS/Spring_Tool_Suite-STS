package com.zensar.ui;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.zensar.bean.Person;
import com.zensar.util.HibernateUtil;

public class Main_1 {

	// Insert data
	static void insert() {
		Person person = new Person();
		person.setName("A NeelaKanta Reddy");
		person.setSalary(44000.00);

		// A Session is used to get a physical connection with a database.
		Session session = null;

		HibernateUtil.init();
		session = HibernateUtil.getSession();

		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();

		HibernateUtil.cleanUp();
	}

	// Read all
	static void load() {
		Person person = null;
		// OR
		// Person person = session.load(Person.class, 3);

		Session session = null;
		HibernateUtil.init();
		session = HibernateUtil.getSession();

		person = session.load(Person.class, 3);

		System.out.println(person);
		HibernateUtil.cleanUp();
	}

	@SuppressWarnings("unchecked")
	static void loadAll() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		// HQL = Hibernate Query Language
		String qry = "from Person";

		// Query query = session.createQuery(qry);
		Query<Person> query = session.createQuery(qry);
		List<Person> allPersons = query.list();

		System.out.println(allPersons);
		HibernateUtil.cleanUp();
	}

	// Update data
	static void editing() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Person person = session.load(Person.class, 2);
		Person p1 = session.load(Person.class, 1);

		person.setSalary(100000.00);
		p1.setName("Param");

		Transaction tx = session.beginTransaction();

		session.update(person);
		session.update(p1);

		tx.commit();

		HibernateUtil.cleanUp();
	}

	// Delete data
	static void delete() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Person person = session.load(Person.class, 3);

		Transaction tx = session.beginTransaction();
		session.delete(person);
		tx.commit();

		HibernateUtil.cleanUp();
	}

	public static void main(String[] args) {
		// insert();
		// load();
		// loadAll();
		// editing();
		delete();
	}
}