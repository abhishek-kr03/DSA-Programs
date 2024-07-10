package com.easy;

import java.util.Scanner;

public class GreatestCommmonDivisor {
	
	// Finding GCD or HCF by brute force approach
	//Time Complexity : O(min(a,b)).
	
	static int gcdOrHcfByBruteForceApproach(int a , int b){
		int min = 0;		
		if(a<b) {
			min = a;
		}else {
			min = b;
		}
		
		for (int i=min ; i>=1 ; i--) {
			if(a%i == 0 && b%i == 0) {
				return i;
			}
		}
		return 1;
	}
	
	// Finding GCD or HCF Using Euclid's Algorithm
	// Time Complexity : O(max(a,b)).
	
		static int gcdOrHcfUsingEuclidsAlgorithm(int a , int b){ 
			
			while (a!=b) {
				if(a>b) {
					a = a-b;
				}else {
					b = b-a;
				}
			}
			return a;
	}
		
	// Finding GCD or HCF Using Gabriel's Lame Algorithm
	// Time Complexity : O(log(min(a,b))).
	// Best Efficiency
		
		static int gcdOrHcfUsingGabrielsAlgorithm(int a , int b){ 
			while(a!=0 && b!=0) {
				if (a > b) {
					a = a%b;
				}else {
					b = b%a;
				}
			}
			if(a!=0) {
				return a;
			}else if (b!=0) {
				return b;
			}
			return 1;
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a=scan.nextInt();
			System.out.println("Enter the value of b");
			int b=scan.nextInt();
			
			System.out.println("The HCF or GCD of the given values is: ");
			int res = gcdOrHcfUsingEuclidsAlgorithm(a, b);			
			System.out.println(res);
			scan.close();
	}
	
}
