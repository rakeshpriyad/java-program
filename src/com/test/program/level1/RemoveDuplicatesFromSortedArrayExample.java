package com.test.program.level1;

public class RemoveDuplicatesFromSortedArrayExample {

	public static void main(String a[]) {
		int[] duplicateSortedAr = { 1, 3, 7, 8, 8, 9, 14, 16, 16, 17, 17 };
		int[] nonDuplicateSortedAr = removeDuplicates(duplicateSortedAr);

		System.out.print("Displaying contents of sorted array(with duplicate elements)  : ");
		for (int i = 0; i < duplicateSortedAr.length; i++) {
			System.out.print(duplicateSortedAr[i] + " ");
		}

		System.out.println();
		System.out.print("Displaying contents of sorted array(with non-duplicate elements) : ");
		for (int i = 0; i < nonDuplicateSortedAr.length; i++) {
			System.out.print(nonDuplicateSortedAr[i] + " ");
		}
	}

	/**
	 * This method returns sorted array with non duplicate elements
	 */
	public static int[] removeDuplicates(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1) {
			return arr;
		}

		int temp[] = new int[n];
		// Start traversing elements
		int j = 0;
		for (int i = 0; i < n - 1; i++)

			// If current element is not equal
			// to next element then store that
			// current element
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}

		// Store the last element as whether
		// it is unique or repeated, it hasn't
		// stored previously
		temp[j++] = arr[n - 1];
		return temp;
	}
}