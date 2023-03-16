package com.recursion;

import java.util.Scanner;

public class SumOfDigits {
	static int sum = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}
	/*
	static int sum(int n) {
		sum = sum+n%10;
		n = n/10;
		sum = sum+n%10;
		n = n/10;
		sum = sum+n%10;
		return sum;
	}
	*/
	
	//using recursion
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		System.out.println((n%10)+" "+(n/10));
		return (n%10+sum(n/10));
	}
	
}
