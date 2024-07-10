package com.recursion;

import java.util.Scanner;

public class ReverseString {

	static String reverseString(String str , String t , int i) {
		if(i < 0) {
			return t;
		}
		return reverseString(str , t+str.charAt(i) , i-1); 
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String res = reverseString(str,"",str.length()-1);
		System.out.println(res);
		scan.close();
	}
}
