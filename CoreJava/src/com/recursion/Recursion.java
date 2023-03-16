package com.recursion;

public class Recursion {
	static int count = 0;
	public static void main(String[] args) {
//		Recursion - compact but complex
		//mirroring code 
		//function calling itself
		hello();
	}
	public static void hello() {
//		count++;
		if(count<=10) {
		System.out.println("Hello");
		count++;
		hello(); //stackoverflowError - stack concentrates on values and heap concentrates on variables
//		count++; //stackoverflowError - stack concentrates on values and heap concentrates on variables
		}
	}
}
