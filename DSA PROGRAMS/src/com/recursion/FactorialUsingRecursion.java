package com.recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	static int factorial(int n) {
		if( n==0 || n==1) {	// base condition
			return 1;
		}
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
		scan.close();
	}
}
