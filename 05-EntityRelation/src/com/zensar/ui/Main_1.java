package com.zensar.ui;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.zensar.bean.pack1.ContactInfo;
import com.zensar.bean.pack1.Person;
import com.zensar.bean.pack1.Salary;
import com.zensar.util.JPAUtil;

public class Main_1 {

	// Insert
	static void test1() {
		Person person = new Person("Macha", LocalDate.of(1999, 8, 27), 'F');
		person.setPersonId(100);

		ContactInfo contactInfo = new ContactInfo("macha@gmail.com", "1234567890");

		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);

		Salary salary = new Salary(404000.00, 2000.00, 28000.00);

		person.setSalary(salary);
		salary.setPerson(person);

		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");

		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	// Read
	static void test2() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		Person person = em.find(Person.class, 100);
		System.out.println(person);
		JPAUtil.shutDown();
	}

	// Read
	static void test3() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		ContactInfo contactInfo = em.find(ContactInfo.class, 100);
		System.out.println(contactInfo);
		System.out.println(contactInfo.getPerson());
		JPAUtil.shutDown();
	}

	// Read All
	@SuppressWarnings("unchecked")
	static void test4() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");

		String qry = "from Person";
		Query query = em.createQuery(qry);
		List<Person> allPersons = query.getResultList();
		System.out.println(allPersons);
		JPAUtil.shutDown();
	}

	// Update
	static void test5() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		Person person = em.find(Person.class, 100);
		person.setPersonName("Bhavya Sree");

		ContactInfo contactInfo = em.find(ContactInfo.class, 100);
		contactInfo.setEmail("Paramesh@gmail.com");

		System.out.println(person);
		em.merge(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	// Delete
	static void test6() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		Person person = em.find(Person.class, 100);
		em.remove(person);

		ContactInfo contactInfo = em.find(ContactInfo.class, 100);
		em.remove(contactInfo);

		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		test1();
		// test2();
		// test3();
		// test4();
		// test5();
		// test6();
	}
}