package com.oops;

import com.oops.inheritance.Child;

class First {
	public int a = 10;
	private int b = 20;
	public static int c = 30;
	private static int d = 40;
	static int e = 50;
	final static int f = 60;
	final int g = 70;
//	private class First - not allowed
//	protected class First - not allowed
	public static void main(String[] args) {
		System.out.println("Hello");
//		public int h = 90;
//		private int h = 100;
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		//System.out.println(g);
		//System.out.println(h);
		Child c = new Child();
		
		System.out.println(c.cash);
		//System.out.println(c.withdraw);
//		c.bike();
//		c.house();
	}
	
}

