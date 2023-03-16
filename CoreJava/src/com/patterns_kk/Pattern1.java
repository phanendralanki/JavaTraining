package com.patterns_kk;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern1(n);
		sc.close();
	}
	static void pattern1(int n) {
		//step-1: Run the outer for loop by identifying the no of rows 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
