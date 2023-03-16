package com.arrays;

import java.util.Scanner;

public class MagicSquare {
	public static  void main(String[] args) {
		/*
		 *  9 2 7 - 18 
		 *  4 6 8 -18 
		 *  5 10 3 -18
		 *  |  | |
		 *  18 18 18 
		 *  and (9+6+3)= 18 (7+6+5) = 18
		 *  */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		
		int sum7 = 0;
		int sum8 = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		//diagonals
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					sum1 = sum1+a[i][j];
				}
				if((i+j)==(n-1)) {
					sum2 = sum2+a[i][j];
				}
			}
		}
		
		
		if(sum1!=sum2) {
			System.out.println("No");
		}
		
		else {
		
		//rows
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0) {
				sum3 = sum3+a[i][j];
				}else if(i==1) {
					sum4 = sum4+a[i][j];
				}else {
					sum5 = sum5+a[i][j];
				}
			}
		}
	
//		columns
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0) {
					sum6 = sum6+a[j][i];
				}else if(i==1) {
					sum7 = sum7+a[j][i];
				}else {
					sum8 = sum8+a[j][i];
				}
			}
		}
		if((sum3==sum6)&&(sum4==sum7)&&(sum5==sum8)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
	}
}
