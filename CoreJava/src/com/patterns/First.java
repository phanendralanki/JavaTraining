package com.patterns;
import java.util.*;
public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) { //rows
			for(int j=1;j<=n;j++) { //columns
			System.out.print(j+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
