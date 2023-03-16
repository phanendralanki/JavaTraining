package com.patterns_kk;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern2(n);
		sc.close();
	}
	
	static void pattern2(int n) {
		/*
		  *
		  * *
		  * * *
		  * * **
		  */
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			//After completing each row we need to print a new line
			System.out.println("");
		}
	}
}
