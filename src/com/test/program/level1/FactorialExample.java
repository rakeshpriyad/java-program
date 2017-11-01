package com.test.program.level1;

public class FactorialExample {
	public static void main(String... args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is: " + findFactorail(num));
	}

	/*
	 * return factorial of num.
	 */
	public static int findFactorail(int num) {
		/*
		 * int factorial=1; while(num>0){ factorial=factorial*num; num--; } return
		 * factorial;
		 */
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;
	}
}