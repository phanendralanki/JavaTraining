package com.methods;

public class Function_1 {
	
	
	public static int a =5;
	private static int b = 6;
	
	public int sum(int x,int y) {
//		return x+y;
		return a+b;
//		return c+d;
	}
	
//	public static int sum(int a,int b) {
//		return a+b;
//	}

	private static int sub(int a,int b) {
		return a-b;
	}
	
	protected static int mul(int a,int b) {
		return a*b;
	}
	static int div(int a,int b) {
		return a/b;
	}
//	 int mod(int a,int b) {
//		return a/b;
//	}
	
	 static int mod(int a,int b) {
		System.out.println(a+b);
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		//What is a method?
		//why a method? - re usability,
		//Why do we reuse code?
		Function_1 obj = new Function_1();
		System.out.println(obj.sum(a, b));
//		System.out.println(sum(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
//		System.out.println(mod(a,b));
//		mod(a,b);
//		int d = div(a,b);
//		System.out.println(d);
		
		
	}
}
