package com.zensar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zensar.bean.SimpleCalculator;

public class SimpleCalculatorTester {

	SimpleCalculator calc;

	@BeforeEach
	public void f1() {
		calc = new SimpleCalculator();
	}
	
	@BeforeAll
	public static void x() {
		System.out.println("x Excute");
	}

	@AfterEach
	public void f2() {
		calc = null;
	}
	
	@AfterAll
	public static void y() {
		System.out.println("y Excute");
	}

	// Add Testing
	@Test
	public void testingAdd() {
		// SimpleCalculator calc = new SimpleCalculator();
		int expected = 8;
		int actual = calc.add(3, 5);
		assertEquals(expected, actual);
		// calc = null;
	}

	@Test
	public void testingAddwithNegitiveData() {
		// SimpleCalculator calc = new SimpleCalculator();
		int expected = -25;
		int actual = calc.add(-10, -15);
		assertEquals(expected, actual);
	}

	// Subtraction Testing
	@Test
	public void testingSub() {
		// SimpleCalculator calc = new SimpleCalculator();
		int expected = 5;
		int actual = calc.sub(10, 5);
		assertEquals(expected, actual);
		// calc = null;
	}

	@Test
	public void testingSubWithNegitiveData() {
		// SimpleCalculator calc = new SimpleCalculator();
		int expected = -5;
		int actual = calc.sub(-10, -5);
		assertEquals(expected, actual);
	}

	// Multiple Testing
	@Test
	public void testingMultiply() {
		// SimpleCalculator calc = new SimpleCalculator();
		int expected = 50;
		int actual = calc.multiply(10, 5);
		assertEquals(expected, actual);
		// calc = null;
	}

	@Test
	public void testingMultiplyWithNegitiveData() {
		// SimpleCalculator calc = new SimpleCalculator();
		int expected = +10;
		int actual = calc.multiply(-2, -5);
		assertEquals(expected, actual);
	}

	// Divide Testing
	@Test
	public void testingDivide() {
		// SimpleCalculator calc = new SimpleCalculator();
		int expected = 2;
		int actual = calc.divide(10, 5);
		assertEquals(expected, actual);
		// calc = null;
	}

	@Test
	public void testingDivideWithNegitiveData() {
		// SimpleCalculator calc = new SimpleCalculator();
		int expected = 2;
		int actual = calc.divide(-10, -5);
		assertEquals(expected, actual);
	}
}