package com.bitmanupulation;

import java.util.Scanner;

//Finding the position of the right most set bit.
public class BitPosition {

	// 1st way.
	// Time complexity O(log n).
	static int positionOfRMSB(int n) {
		int mask = 1;
		int position = 1;
		
		if(n == 0) {
			return -1;
		}
		
		while((n & mask) == 0) {
			
			mask = mask << 1;
			position++;
		}
		return position;
	}
	
	// 2nd way.
	// Time Complexity O(1), Best efficiency.
	static int positionOfRMSB1(int n) {
		
		return (int)(Math.log10(n ^ (n & (n-1))) / Math.log10(2)) + 1;
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int res = positionOfRMSB1(n);
		System.out.println(res);
		scan.close();
	}
} 
