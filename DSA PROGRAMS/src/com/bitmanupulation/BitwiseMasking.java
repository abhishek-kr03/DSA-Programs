package com.bitmanupulation;

import java.util.Scanner;

// Creating the Mask on bits.

// Program for switching ON the Ith bit.
public class BitwiseMasking {
	
	static int  switchOnIthBit(int n , int i) {
		
		int onMask = 1 << i; // declaring the mask on the bit.
		return n | onMask;	 // OR operator will turn on the bit if we perform operation with 1.
	}
	
	static int switchOffIthBit(int n , int i) {
		
		int offMask = ~(1 << i);
		return n & offMask;
	}
	
	static int toggle(int n , int i) {
		int tMask = 1 << i;
		return n ^ tMask;
	}
	
	static void checkOnOrOff(int n , int i) {
		int checkMask = 1 << i;
		if((n & checkMask) == 0) {
			System.out.println("OFF");
		}
		else {
			System.out.println("ON");
		}
	}
	
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Enter the decimal number:");
		   int n = scan.nextInt();
		   System.out.println("Enter the position of the ith element you want to Switch ON:");
		   int i = scan.nextInt();
		  
		   int res1 = switchOnIthBit(n, i);
		   int res2 = switchOffIthBit(n, i);
		   int res3 = toggle(n, i);
		   checkOnOrOff(n, i);
		   System.out.println(res1);
		   System.out.println(res2);
		   System.out.println(res3);
		   
		   scan.close(); 
	}
}
