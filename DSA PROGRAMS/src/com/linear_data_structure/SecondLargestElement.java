package com.linear_data_structure;

import java.util.Scanner;

//Span of an Array.

public class SecondLargestElement {

	static int secondLargestElement(int arr[]) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		if(arr[0] > arr[1]) {
			largest = arr[0];
			secondLargest = arr[1];
		}else {
			largest = arr[1];
			secondLargest = arr[0];
		}
		for(int i=2 ; i<arr.length ; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && largest != arr[i]) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
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
		System.out.println("The second largest element in the array is:\n" + secondLargestElement(arr));
		scan.close();
	}
}
