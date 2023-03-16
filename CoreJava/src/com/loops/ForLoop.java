package com.loops;

public class ForLoop {
	public static void main(String[] args) {
		//for loop cannot take post increment or post decrement
//		for(int i=2;i<=10;i++) {
//			if(i%2==0)
//				System.out.println(i);
//		}
		//for loop cannot take post increment or post decrement
		//by default for loop consider it as pre increment or pre decrement
		//6,6
		for(int i=1;i<=6;i++) {
			System.out.print(i+" ");
		}
	}
}
