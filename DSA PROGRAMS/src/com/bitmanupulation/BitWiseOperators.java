package com.bitmanupulation;

public class BitWiseOperators {

	public static void main(String[] args) {
		System.out.println(5 | 9);  // OR Operation
		System.out.println(5 & 9);  // AND Operation
		System.out.println(5 ^ 9);  // XOR Operation
		System.out.println(5 << 1); // Left Shift Operation
		System.out.println(-5 << 1);
		System.out.println(5 >> 1);
		System.out.println(-5 >> 1);
		System.out.println(-5 >>> 1);
		System.out.println(~2);
		System.out.println(~-2);
		
	}
}

// OutPut :

// 13
// 1
// 12
// 10
// -10
// 2
// -3
// 2147483645
// -3
// 1