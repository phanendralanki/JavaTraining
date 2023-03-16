package com.patterns_kk;

import java.util.Scanner;

public class Pattern28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern28(n);
		sc.close();
	}
	
	static void pattern28(int n) {
		for(int i=1;i<=(2*n)-1;i++) {
			int col = i>5?col=2*n-i:i;
			int noOfSpaces = n-col;
			for(int s=1;s<noOfSpaces;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}
