 package com.easy;

import java.util.Scanner;

public class LowestCommonFactor {
	
	static int findingLcm(int a, int b) {
		return (a*b) / euclidGcd(a,b);
		
	}
	static int euclidGcd(int a , int b){   
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
	
	System.out.println("The LCM of the given values is: ");
	int res = findingLcm(a, b);
	System.out.println(res);
	scan.close();
	}
}
