package com.variables;

public class Code {
	static int c = 30;
	int a = 10;
	public static void main(String[] args) {
		//static int b = 10;
		int b = 10;
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		Code c = new Code();
		int d = c.a;
		System.out.println(d);
		System.out.println(c.a);
	}
}
