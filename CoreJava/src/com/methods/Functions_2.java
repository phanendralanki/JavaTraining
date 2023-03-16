package com.methods;

public class Functions_2 {

	public static int sum (int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a = 5,b=6,c=7,d = 8;
		System.out.println(sum(sum(a,b),sum(c,d)));
	}
}
