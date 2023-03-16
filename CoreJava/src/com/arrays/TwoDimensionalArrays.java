package com.arrays;

import java.util.Scanner;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int[][] a = new int[n1][n2];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||j==n-1) {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		*/
		
		//memory = (start value)+(index*dtb)
		// 100+(0*4) = 100
			// 200+(0*4) = 200
			// 200+(1*4) = 204 
		// 100+(1*4)= 104 
			// 600 + (0*4) = 600
			// 600 + (1*4) = 604
		
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a;
		a = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		//maximum number in row
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a;
		a = new int[n][n];
		int max = a[0][0];
//		int min = a[0][0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]>max) {
					max = a[i][j];
				}
		}
			System.out.println("The maximum value in "+(i+1)+" row "+max+" ");
		
		}
		*/
		
//		Maximum number in a column
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int max = arr[0][0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j][i]>max) {
					max = arr[j][i];
				}
			}
			System.out.println(max);
		}
		*/
		
		//minimum number in a row
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int min = arr[0][0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
			}
			System.out.println(min);
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] c = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Addition: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("subtraction: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j] = a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
//		Addition of two matrices
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j] = sc.nextInt();
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
}
}
