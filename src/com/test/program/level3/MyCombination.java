package com.test.program.level3;

public class MyCombination {
	
	public static void main(String[] args) {
		String s = "ABCDE";
		char sequence [] =s.toCharArray();
		printCombination(sequence, 3);
	}

	private static void printCombination(char[] sequence, int n) {
		char temp[] = new char[n];
		for(int r=0; r<sequence.length; r++)// {
			combination(sequence,temp, 0, n-1, 0,r);
		//}
		
	}

	private static void combination(char[] arr, char temp[], int start, int end, int index, int r) {
		if(index == r) {
			for(int i=0; i<r; i++) {
				System.out.print(temp[i] + " ");
			}
			System.out.println("");
		}

		
		for (int i = start; i <= end && ((end - i + 1) >= (r - index)); i++) {
			temp[index] = arr[i];
			combination(arr, temp, i+1, end, index+1, r);
		}
		
		
	}
}
