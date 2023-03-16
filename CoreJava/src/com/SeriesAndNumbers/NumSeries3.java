package com.SeriesAndNumbers;

import java.util.Scanner;

//5 - 3 9 27 81 248

public class NumSeries3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int mul = 1;
		for(int i=1;i<=num;i++) {
			mul = mul*3;
			System.out.print(mul+" ");
		}
	}
}
