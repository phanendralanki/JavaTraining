package com.strings;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = new String("Hello");	//Heap memory
		System.out.println(s1);				
		String s2 = "ABC";			//scp
		System.out.println(s2);
		System.out.println(s1.hashCode());	//memory address
		System.out.println(s2.hashCode());	//memory address
		s1 = "phani";
		System.out.println(s1.hashCode());
		s2 = "phanendra";
		System.out.println(s2.hashCode());
	}
}
