package com.easy;

import java.util.Scanner;

public class PrimeFactors {
	
	// Much efficient then of the naieve approaches.
	// Time Complexity = O(root n(log n)).
	static void primeFactors(int n) {
		int i = 2;
		while(i*i <= n) {
			while(n % i == 0) {
				System.out.println(i);
				n = n/i;			
			}
			i++;
		}
		if(n > 1) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		primeFactors(n);
		scan.close();
	}
}
