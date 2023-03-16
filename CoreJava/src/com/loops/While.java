package com.loops;

public class While {
	public static void main(String[] args) {
		//1.even numbers from 1-10;
		int i=1;
		while(i<=10) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
