package com.test.program.level1;

public class ReverseString {

	public static void main(String[] args) {
		String str="Rakesh";
		String rev=reverse(str);
		System.out.println("original string : "+ str);
		System.out.println("Reverse string: "+  rev);

	}
	
	public static String reverse(String originalStr) {
		char [] arr=originalStr.toCharArray();
		for(int i=0, j= arr.length-1; i<(arr.length/2); i++, j--) {
			char temp =arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
		}
		return new String(arr);
	}
}
