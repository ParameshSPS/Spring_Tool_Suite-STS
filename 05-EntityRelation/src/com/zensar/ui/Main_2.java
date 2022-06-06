package com.zensar.ui;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.zensar.bean.pack2.Course;
import com.zensar.bean.pack2.Subject;
import com.zensar.util.JPAUtil;

public class Main_2 {

	// Insert Data
	static void test1() {
		Subject subject1 = new Subject("Aptitude/Reasoning", 80);
		Subject subject2 = new Subject("Code Basics", 40);
		Subject subject3 = new Subject("Logical Codings", 05);
		Subject subject4 = new Subject("Practice", 20);

		Set<Subject> subjects = new HashSet<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);

		Course course = new Course("Placement Training", 10000.00, subjects);

		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");

		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	// Read
	static void test2() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		Course course = em.find(Course.class, 1);
		System.out.println(course);
		JPAUtil.shutDown();
	}

	// Read All
	@SuppressWarnings("unchecked")
	static void test3() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		String qry = "from Course"; // "from Subject";
		Query query = em.createQuery(qry);
		List<Course> allCourses = query.getResultList();
		System.out.println(allCourses);
		JPAUtil.shutDown();
	}

	// Update
	static void test4() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		Course course = em.find(Course.class, 2);
		course.setFees(35000.00);

		Subject subject = em.find(Subject.class, 7);
		subject.setSubjectName("Code Practice");

		System.out.println(course);
		em.merge(course);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	// Delete
	static void test5() {
		EntityManager em = JPAUtil.createEntityManager("JPA_Intro");
		em.getTransaction().begin();

		Subject subject = em.find(Subject.class, 8);
		System.out.println(subject);
		em.remove(subject);

		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		test1();
		// test2();
		// test3();
		// test4();
		// test5();
	}
}