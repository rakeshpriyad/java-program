package com.test.program.level2;

public class FactorialRecursionExample {
	public static void main(String... args) {
		int num = 4;
		System.out.println("Factorial of " + num + " is: " + findFactorail(num));
	}

	/*
	 * return factorial of num.
	 */
	public static int findFactorail(int num) {

		if (num == 0)
			return 1;

		return num * findFactorail(num - 1);
	}
}