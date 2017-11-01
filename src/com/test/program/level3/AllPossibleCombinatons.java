package com.test.program.level3;

public class AllPossibleCombinatons {
	static void printCombinations(char[] sequence, int N) {
		char[] temp = new char[N];
		for (int r = 0; r < sequence.length; r++)
			combinations(sequence, temp, 0, N - 1, 0, r);
	}

	private static void combinations(char[] ar, char[] temp, int start, int end, int index, int r) {

		if (index == r) {
			for (int j = 0; j < r; j++) {
				System.out.print(temp[j] + " ");
			}
			System.out.println();
		}

		for (int i = start; i <= end && ((end - i + 1) >= (r - index)); i++) {
			temp[index] = ar[i];
			combinations(ar, temp, i + 1, end, index + 1, r);
		}
	}

	public static void main(String args[]) {
		String str = "ABCDE";
		char[] sequence = str.toCharArray();// { 'a', 'b', 'c', 'd', 'e' };
		System.out.print("The combinations are: ");
		// printCombinations(sequence, sequence.length);
		printCombinations(sequence, 3);
	}
}