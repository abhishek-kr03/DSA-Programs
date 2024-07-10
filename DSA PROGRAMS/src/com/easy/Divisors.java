package com.easy;

import java.util.Scanner;

public class Divisors {

	//Brute force approach OR Naieve approach.
	//Time Complexity = O(n).
	static void printFactors(int n) {
		for (int i=1 ; i<=n ; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	// More Efficient
	// Time Complexity = O(root n).
	static void printDivisors(int n) {
		int i=0;
		for (i=1 ; i*i<=n ; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		for ( ; i>=1 ; i--) {
			if(n%i == 0 && i != n/i) {
				System.out.println(n/i);
			}
		}
	}
	
	//Main method. 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printDivisors(n);
		scan.close();
	}

}
