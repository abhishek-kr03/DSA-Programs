package com.recursion;

import java.util.Scanner;

public class StringPalindrom {

	static boolean checkPalindrom(String str, int i, int j) {
		if(str.charAt(i) != str.charAt(j)) {
			return false;
		}
		if( j <= i) {
			return true;
		}
		return checkPalindrom(str, i+1, j-1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		boolean res = checkPalindrom(str , 0 , str.length()-1);
		System.out.println(res);
		scan.close();
	}
}
