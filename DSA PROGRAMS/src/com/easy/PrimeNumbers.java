package com.easy;

import java.util.Scanner;

public class PrimeNumbers {
	
	//  Time Complexity = O(root n).
	public static boolean checkPrime(int n) {
		
		if(n == 1) {
			return false;
		}
		if (n == 2 || n==3) {
			return true;
		}
		if(n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		
		for (int i=5 ; i*i<=n ; i=i+6) {
			if(n % i == 0 || n % (i+2) == 0) {
				return false;
			}
		}
		return true;
	}
	//Finding all the prime numbers till the given number.
	//TIme Complexity = O(n * root n).
	public static void printPrime(int n) {

		for (int i=2 ; i<=n ; i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	//Finding all the prime numbers till the given number. 
	//TIme Complexity = O(root n log(log(n))) OR O(root n) because here the log values is so small that we can ignore it.
	public static void sievePrintPrime(int n) {
		
		boolean[] arr = new boolean[n+1];
		for (int i=2 ; i*i<=n ; i++) {
			if(arr[i] == false) {
				for (int j=i*i ; j<=n ; j=j+i) {
					arr[j] = true;
				}
			}
		}
		for (int i=2 ; i<=n ; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	//Main method.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		sievePrintPrime(n);
		scan.close();
	}
}
