package com.arrays;

import java.util.Scanner;

public class ArrayMethods {
	public static void main(String[] args) {
		//int[] a = {1,2,3};
		//int[] b = {1,2,3};
		
//		System.out.println(a.hashCode());
////		System.out.println(a[0].hashCode());
//		System.out.println(a.length);
//		System.out.println(a.equals(b));
//		
//		System.out.println(a == b);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
