package com.SeriesAndNumbers;

import java.util.*;

//5 - 6 11 21 36 56

public class NewSeries2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ex: 6 11 21 36 56
		int num = sc.nextInt();
		int num2 = 6;
		for(int i=1;i<=num;i++) {
			System.out.print(num2+" ");
			int num3 = i*5;
			num2 = num2+num3;
		}
		
		sc.close();
	}
}
