package com.basics;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.print("Hello");
		System.out.print("Hello");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value: ");
		int a = sc.nextInt();	
		System.out.println("Enter byte value: ");
		byte b = sc.nextByte();
		System.out.println("Enter float value: ");
		float c = sc.nextFloat();
		System.out.println("Enter string: ");
		String d = sc.next();
		System.out.println("Enter string: ");
		String e = sc.nextLine();
		System.out.println("Enter boolean: ");
		boolean f = sc.nextBoolean();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		sc.close();
	}
	
}
