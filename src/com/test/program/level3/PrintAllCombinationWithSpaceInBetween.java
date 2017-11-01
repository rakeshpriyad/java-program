package com.test.program.level3;

public class PrintAllCombinationWithSpaceInBetween {
	public static void main(String[] args) {
		String str = "ABC";
		char[] ar = str.toCharArray();

		// Keep tempAr size double-1 than original
		// So that it could hold String like "A B C"
		char[] tempAr = new char[(2 * ar.length) - 1];
		tempAr[0] = ar[0];
		getCombinations(ar, tempAr, 1, 1, ar.length);
	}

	public static void getCombinations(char[] ar, char[] tempAr, int i, int j, int len) {
		if (i == len) {
			while (j < tempAr.length) {
				tempAr[j] = ' ';
				j++;
			}
			System.out.println(tempAr);
			return;
		}
		tempAr[j] = ar[i];
		getCombinations(ar, tempAr, i + 1, j + 1, len);

		tempAr[j] = ' ';
		tempAr[j + 1] = ar[i];
		getCombinations(ar, tempAr, i + 1, j + 2, len);
		return;
	}
}
