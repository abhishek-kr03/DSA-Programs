package com.recursion;

import java.util.Scanner;

public class CountingNumber {
	static int numberCount(int n) {
		if(n == 0) {
			return 0;
		}
		return numberCount(n/10) + 1;
	}
	
	static int sumOfDigits(int n) {
		if(n == 0) {
			return 0;
		}
		return sumOfDigits(n/10) + (n%10);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(numberCount(n));
		System.out.println(sumOfDigits(n));
		scan.close();
	}
}