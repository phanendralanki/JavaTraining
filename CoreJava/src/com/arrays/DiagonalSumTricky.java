package com.arrays;

import java.util.Scanner;

public class DiagonalSumTricky {
	/*
	 * 1 0 0	1 2 3
	 * 0 2 0	0 1 0	- No
	 * 0 0 5	0 0 5
	 * 
	 * 
	 * */
	/*
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = 0;
	int[][] arr = new int[n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if((i==j)&&(arr[i][j]!=0)) {
				m++;
			}
		}
	}
	if(m==n) {
		System.out.println("yes");
	}else {
		System.out.println("No");
	}
	
	sc.close();
	*/
	
	
	/*
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0;
		int q = 0;
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i!=j)&&(arr[i][j]!=0)) {
					p=1;
					break;
				}
				if((i==j)&&(arr[i][j]==0)) {
					q++;
				}
			}
		}
		
		if((p==0)&&(q==n)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
		}
		*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p=0;
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i!=j)&&(arr[i][j]==0)) {
					p=1;
				}
			}
		}
	}
}
