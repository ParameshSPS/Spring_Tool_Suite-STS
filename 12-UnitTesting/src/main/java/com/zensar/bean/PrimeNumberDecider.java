package com.zensar.bean;

public class PrimeNumberDecider {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isPrimeNumber() {
		boolean isPrime = true;
		for (int i = 2; i <= this.number / 2; i++) {
			if (this.number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}