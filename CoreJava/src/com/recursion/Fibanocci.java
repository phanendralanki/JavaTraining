package com.recursion;

import java.util.Scanner;

public class Fibanocci {
	public static int a = 0;
	public static int b = 1;
	public static int c = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
//		sc.close();
	}
	public static int fib(int n) {
		if(n==1){
			return 0;
		}
		else {
			if(n==2) {
				return 1;
			}else {
			return (fib(n-1)+fib(n-2));
			}
		}
	}
}
