package com.logicalQuestions;

import java.util.Scanner;

public class FactorialNumberUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Invalid number");
		}else {
			System.out.println(factorial(n));
		}
	}
	public static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
}
