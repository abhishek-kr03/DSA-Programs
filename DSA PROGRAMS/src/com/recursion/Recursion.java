package com.recursion;

public class Recursion {

	static void fun(int n) {
		if(n < 1) {
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	
	public static void main(String[] args) {
		fun(3);
	}

}
