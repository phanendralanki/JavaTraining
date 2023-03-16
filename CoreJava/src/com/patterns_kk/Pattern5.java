package com.patterns_kk;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern5(n);
		sc.close();

	}
	static void pattern5(int n) {
		for(int row=1;row<=(2*n)-1;row++) {
			int totalColsInRow = row>n?2*n-row:row;
			for(int col=1;col<=totalColsInRow;col++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
