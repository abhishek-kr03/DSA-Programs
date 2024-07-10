package com.easy;

import java.util.Scanner;

//Factorial Trailing Zeros

public class TrailingZeros {
	
	static int factorialTrailingZeros(int n) {
		int res = 0;
		int powOf5 = 5;
		while(n >= powOf5) {
			res += n/powOf5;
			powOf5 = powOf5 * 5;
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int result = factorialTrailingZeros(n);
		System.out.println(result);
		scan.close();
	}
}
