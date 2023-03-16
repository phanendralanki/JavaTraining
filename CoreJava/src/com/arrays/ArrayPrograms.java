package com.arrays;

import java.util.Scanner;

public class ArrayPrograms {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = arr[0];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		sc.close();
	}
 */
		//2nd sum of two arrays 
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int [] arr2 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+arr2[i]+" ");
		}
		*/
		
		
		//3rd question - 
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr1[i]>=arr2[i]) {
				System.out.println("compatible");
			}else
				System.out.println("not");
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int op = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==op) {
				System.out.println(op+" is present in the array");
			}
		}
		*/
		
		//5th
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int dis = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[i++]) {
				dis++;
			}
		}
		System.out.println(dis); */
		
		//7- sum of even numbers
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				sum = sum+arr[i];
			}
		}
		System.out.println("The sum of the even numbers in the array is "+sum);
		*/
		
		
		//sum of even and odd numbers 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int odd = 0;
		int even = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even = even+arr[i];
			}else {
				odd = odd + arr[i];
			}
		}
		System.out.println("The sum of the even numbers in the array is "+even);
		System.out.println("The sum of the odd numbers in the array is "+odd);
	}
}
