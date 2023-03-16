package com.methods;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		//factorial -> 5! = 5*4*3*2*1
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		fact(n);
		sc.close();
	}
	
	public static int fact(int n) {
		int factorial = 1;
		for(int i=1;i<=n;i++) {
			factorial = factorial*i;
		}
		return factorial;
//		System.out.println(factorial);
	}
}
