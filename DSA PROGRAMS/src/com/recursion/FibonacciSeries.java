package com.recursion;

import java.util.Scanner;

public class FibonacciSeries {

	static long fibo(long n) {
		if(n == 1 || n == 2) { // base condition.
			return 1;
		}
		return fibo(n - 1) + fibo (n - 2);
		
	}
	
	// Using simple logic.
	static long fibonacci(int n) {
		int current = 1;
		int prev1 = 1;
		int prev2 = 1;
		
		if( n == 1 || n == 2)
		{
			return 1;
		}
		for (int i=3 ; i<=n ; i++) {
			current = prev1 + prev2;
			prev1 = prev2;
			prev2 = current;
		}
		return current;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fibo(n));
		scan.close();
	}
}
