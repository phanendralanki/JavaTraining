package com.oops.inheritance;

public class GrandParent {
	int cow = 25000;
	public void farmHouse() {
		System.out.println("Grand Parent's farm house");
	}
	public void farmLand() {
		System.out.println("Grand Parent's Farm Land");
	}
	
	public static void main(String[] args) {
		GrandParent g = new GrandParent();
	}
	GrandParent(){
		System.out.println("Grand parent constructor");
	}
}
