package com.zensar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zensar.bean.PrimeNumberDecider;

public class PrimeNumberDeciderTester {

	PrimeNumberDecider decider;

	@BeforeEach
	public void f1() {
		decider = new PrimeNumberDecider();
	}

	@AfterEach
	public void f2() {
		decider = null;
	}

	@Test
	public void test1() {
		decider.setNumber(15);
		boolean actual = decider.isPrimeNumber();
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		decider.setNumber(17);
		boolean actual = decider.isPrimeNumber();
		boolean expected = true;
		assertEquals(expected, actual);
	}
}