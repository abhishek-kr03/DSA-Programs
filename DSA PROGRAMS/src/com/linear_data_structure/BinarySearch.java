package com.linear_data_structure;

import java.util.Scanner;

public class BinarySearch {
	
	static int targetElementPosition(int[] arr, int target){
		int low = 0;
		int mid = 0;
		int high = arr.length;
		
		while(low <= high) {
			mid = (low + high)/2;
			if(target == arr[mid]) {
				return mid;
			}
			else if(target < arr[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return -1;
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
		System.out.println("Enter the target element to fetch the index number:");
		int target = scan.nextInt();
		
		System.out.println("The index no. of the Element in the Array is: " + targetElementPosition(arr, target));
		scan.close();
	}
}
