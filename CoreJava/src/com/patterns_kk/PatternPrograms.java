package com.patterns_kk;

import java.util.Scanner;

public class PatternPrograms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//pattern1(n);
		//pattern2(n);
		//pattern3(n);
//		pattern4(n);
		pattern5(n);
		
		sc.close();
	}

	/*
	static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	*/
	
	/*
	static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	*/
	
	/*
	static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j)<=n) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	*/
	
	/*
	static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=(n-i);space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	*/
	
	static void pattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=(n-i);space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
