package com.recursion;

import java.util.Scanner;

public class Power {
//	public static int power;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(a,n));
		sc.close();
	}
	
	public static int power(int a,int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (a*power(a,n-1));
		}
	}
}
