package com.strings;
import java.util.Scanner;
public class StringMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String s1 = sc.nextLine();
//		System.out.println(s1);
//		System.out.println(s1.charAt(0));
	
//		System.out.println("Bye");
//		System.out.println("Hi");
//		String s2 = sc.nextLine();
//		System.out.println("Bye");
//		System.out.println("Hi");
//		String s3 = sc.nextLine();
//		System.out.println("Bye");
//		System.out.println("Hi");
//		String s4 = sc.nextLine();
//		System.out.println("Bye");
//		System.out.println("Hi");
//		String s5 = sc.nextLine();
//		System.out.println("Bye");
//		System.out.println("Hi");
		
		//String Methods
		String s1 = sc.nextLine();
//		System.out.println(s1);
//		System.out.println(s1.charAt(3)); //returns char
//		System.out.println(s1.codePointAt(2)); //returns int
//		System.out.println(s1.codePointBefore(3)); //returns int
		//System.out.println(s1.codePointCount(3, 12));
		
		String s2 = sc.nextLine();
//		System.out.println(s1.compareTo(s2)); //returns 0- if true,else unicode +ve/-ve
//		System.out.println(s1.compareToIgnoreCase(s2));
		
		//concat - concats at end without space 
//		System.out.println(s1.concat(s2));
//		System.out.println(s2.concat(s1));
		
		//contains - returns true or false - boolean
		//individual character cannot be passed in single quotations
//		System.out.println(s1.contains("ello"));
//		System.out.println(s1.contains('H'));
//		System.out.println(s2.contains("H"));
		
		 // contentEquals(CharSequence cs) - returns true or false
		//System.out.println(s1.contentEquals(s2));
		//System.out.println(s1.contentEquals("ello")); //false
		
		
		//endsWith - returns true or false
//		System.out.println(s1.endsWith("lo"));
//		System.out.println(s1.endsWith('h'));
//		System.out.println(s1.endsWith(s2));
		
		//equals - compares two strings and returns boolean
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals("Hello"));
//		System.out.println(s1.equals(hello));
//		System.out.println(s1.equals(s2)); //hello and HELLO
		
		//equalsIgnoreCase - compares two strings and ignores case
//		System.out.println(s1.equalsIgnoreCase(s2)); //true
//		System.out.println(s1.equalsIgnoreCase('Hello'));
//		System.out.println(s1.equalsIgnoreCase("hello"));

		//getBytes()
//		System.out.println(s1.getBytes());
//		System.out.println(s1.getBytes("ello"));
//		System.out.println(s1.getBytes(s2));
		
		//hashCode() - returns hash code for this string = address of stored location
		//returns integer
		
//		int a = 5;
//		System.out.println(a.hashCode()); //cannot invoke hashCode() on primitive type data
//		System.out.println(sc.hashCode()); 
		
//		indexOf()
//		System.out.println(s1.indexOf('g')); //-1 if string is not present
//		System.out.println(s1.indexOf(1));
//		System.out.println(s1.indexOf('o'));
		
		//intern() - returns a canonical representation of the string obj
		//System.out.println(s1.intern());
		//canonical - as it is whatever we are giving
		//return type is string
		
		//length() - retuns length of the string i.e integer and it starts from 1
		
//		System.out.println(s1.length()); //0 if string is empty
		
		//isEmpty() - returns true or false(boolean)
		//System.out.println(s1.isEmpty());
		
		//lastIndexOf('l') - returns the last index of the 
		//System.out.println(s1.lastIndexOf(4)); //-1
		//System.out.println(s1.lastIndexOf(1)); //-1
		//System.out.println(s1.lastIndexOf('l')); //3
		
		//matches() - returns true or false if the complete string matches
//		System.out.println(s1.matches(s2));
//		System.out.println(s1.matches("hello"));
//		System.out.println(s1.matches("h"));
		
		//replace() - returns string 
		//System.out.println(s1.replace('h', 'H'));
		//System.out.println(s1);
		
		//replaceAll()
//		System.out.println(s1.replaceAll("l", "L")); //hello,phani -> phani
		
//		String s3 = "aaabbba";
//		System.out.println(s3.replace('a', 'c'));
//		System.out.println(s3.replaceAll("a", "d"));
		
		//replaceFirst()
//		System.out.println(s1.replaceFirst(s1, s2));
		
		//split() - return type is string array(String[])
//		System.out.println(s1.split(s2));
		
		//s1 = "hello world";
		//s2 = "rld";
//		String[] s3 = s1.split(s2);
//		System.out.println(s3);
		
		
		//startsWith - returns true or false
//		System.out.println(s1.startsWith("h"));
		
		//endsWith - returns true or false
//		System.out.println(s1.endsWith("o"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
