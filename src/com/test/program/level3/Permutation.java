package com.test.program.level3;

// Java program to print all permutations of a
// given string.
public class Permutation {
	public static void main(String[] args) {
		String str = "ABCD";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n - 1);
		
		//permutation.permuteString(str, 0, n - 1);
	}

	/**
	 * permutation function
	 * 
	 * @param str
	 *            string to calculate permutation for
	 * @param low
	 *            starting index
	 * @param high
	 *            end index
	 */
	private void permute(String str, int low, int high) {
		//print the string when low has reached to end of string
		if (low == high)
			System.out.println(str);
		else {
			for (int i = low; i <= high; i++) {
				str = swap(str, low, i);
				permute(str, low + 1, high);
				str = swap(str, low, i);
			}
		}
	}
	
	private void permuteString(String s, int beg, int end) {
		
		if(beg == end) {
			System.out.println(s);
		}else {
			for (int i = beg; i <= end; i++) {
			s = swapString(s, beg, i);
			permuteString(s, beg+1, end);
			s = swapString(s, beg, i);
			}
		}
	}
	
	public String swapString(String s, int i, int j) {
		char arr[] = s.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		
		arr[j] = temp;
		
		return String.valueOf(arr);
		
	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a
	 *            string value
	 * @param i
	 *            position 1
	 * @param j
	 *            position 2
	 * @return swapped string
	 */
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	
}
