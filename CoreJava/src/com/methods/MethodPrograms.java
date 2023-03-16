package com.methods;

import java.util.Scanner;

public class MethodPrograms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//System.out.println(add(a,b));
//		System.out.println(mul(a,b));
//		System.out.println(sub(a,b));
//		System.out.println(div(a,b));
		swap(a,b);
		sc.close();
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	
	public static void swap(int a,int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}
	
}
