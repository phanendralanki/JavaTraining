package com.MyPackage;

import java.util.Scanner;
public class UserDetails {
	public static String name;
	public static String email;
	public static String mobile;
	public static int age;
	public static String gender;
	
	public static Scanner sc = new Scanner(System.in);
	public static void getDetails() {
		System.out.println("\t\t **** Welcome to Registration **** \t\t\n");
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your email: ");
		email = sc.next();
		System.out.println("Enter your mobile: ");
		mobile = sc.next();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your gender: M/F ");
		gender = sc.next();
		
	}
	
}
