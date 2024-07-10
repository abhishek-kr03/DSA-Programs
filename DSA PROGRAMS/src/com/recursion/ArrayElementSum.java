package com.recursion;

import java.util.Scanner;

public class ArrayElementSum {
	
	static int elementSum(int[] arr , int i) {
		
		if(i == arr.length) {
			return 0;
		}
		return elementSum(arr, i+1) + arr[i];	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements of the Array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(elementSum(arr, 0));
		scan.close();
	}
}

