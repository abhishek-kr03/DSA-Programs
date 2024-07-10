package com.bitmanupulation;

import java.util.Scanner;

public class BinaryConversion {
	
	static String decimalToBinary(int n){
		String b = "";
		
		while(n>=1) {
			int x = n%2;
			n = n/2;
			b = x + b;
		}
		return b;
		
	}
	
	static int BinaryToDecimal(String b) {
		int result = 0;
		int powOf2 = 1; // because initially the 2^0 = 1.
		
		for (int i=b.length()-1 ; i>=0 ; i--) {
			if(b.charAt(i) == '1') {
				result = result + powOf2;
			}
			powOf2 = powOf2 * 2;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String b = decimalToBinary(n);
		int i = BinaryToDecimal(b);
		System.out.println(b);
		System.out.println(i);
		scan.close();
	}
}
