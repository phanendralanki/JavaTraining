package com.strings;

public class Stringbuffer {
	public static void main(String[] args) {
//	StringBuffer s1 = "abc"; //can't possible to create an object without using new keyword except for String
//		
//	StringBuffer sb1 = new StringBuffer("ABC");
//	System.out.println(sb1);
//	System.out.println(sb1.hashCode());
//	
//	StringBuffer s1 = new StringBuffer("ABC");
//	System.out.println(s1.hashCode());
//	StringBuffer s2 = new StringBuffer("ABC");
//	System.out.println(s2.hashCode());
//	
//	StringBuilder sb2 = new StringBuilder("ABC");
//	System.out.println(sb2);
//	System.out.println(sb2.hashCode());
////	System.out.println(sb1==sb2);
//	
//	StringBuilder sb3 = new StringBuilder("ABC");
//	System.out.println(sb3.hashCode());
//	StringBuilder sb4 = new StringBuilder("ABC");
//	System.out.println(sb4.hashCode());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.append(1));
		System.out.println(sb.append(1.5F));
		System.out.println(sb.append(2.564));
		//not possible to pass more than one argument
//		System.out.println(sb.append('a','b','c')); 
		
	
	}
}
