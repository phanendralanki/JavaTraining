package com.oops.inheritance;

//public class Parent extends GrandParent{
public class Parent{
	int bankBalance = 10000;
	public int cash = 1000;
	private int withdraw = 3000;
	protected int personalExpense = 1000;
	
	
	public static void house() {
		System.out.println("Father's house");
	}

	private static void car() {
		System.out.println("Father's car");
	}

	protected static void laptop() {
		System.out.println("father's laptop");
	}
	
	static void eat() {
		System.out.println("eat");
	}
	
	Parent(){
		System.out.println("Parent constructor");
	}
}
