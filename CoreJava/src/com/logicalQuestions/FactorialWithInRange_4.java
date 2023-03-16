package com.logicalQuestions;

import java.util.Scanner;

public class FactorialWithInRange_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Invalid");
		}else {
			for(int i=0;i<n;i++) {
			System.out.print(factorial(i)+" ");
			}
		}
		sc.close();
	}
	public static int factorial(int n) {
		int fact = 1;
		for(int i=0;i<n;i++) {
			if(i==0) {
				fact = fact*1;
				
			}else {
				fact = fact*i;
				
			}
		}
		return fact;
	}
	
	
}	
