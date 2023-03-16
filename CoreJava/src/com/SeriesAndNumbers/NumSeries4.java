package com.SeriesAndNumbers;

import java.util.Scanner;

//7
//0 4 8 16 24 36 48 

public class NumSeries4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2==0)
				System.out.print(i*i+" ");
			else
				System.out.print(i*i-1+" ");
		}
		
		sc.close();
	}
}
