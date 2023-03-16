package com.SeriesAndNumbers;

import java.util.Scanner;
//6 - 1 4 9 16 25 36

public class NewSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i*i+" ");
		}
		sc.close();
	}
}
