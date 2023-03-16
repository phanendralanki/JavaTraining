package com.strings;

public class Strings_4 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";	//scp
		String s3 = new String("ABC"); //heap memory
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1=="ABC");
		//if literals are created without new keyword i.e the string in scp can be comparable with ==
		
		System.out.println(s2==s3); //false - but s2 and s3 are having same values this is because jvm doesn't find the objects that are out in heap
		System.out.println(s2.equalsIgnoreCase(s3));
		String s4 = new String("ABC");
		System.out.println(s3==s4); //false - but s3 and s4 are having same values 
		System.out.println(s1==s2);
		//s1==s2(true), s2==s3(false),s3==s4(false)
		//it cannot able to compare the literals between heap and scp
		
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode()+" "+s4.hashCode());
		
		//do not blindly depend on == in strings it doesn't throws an error
		
//		System.out.println("There is a book named \"The Ramayana\" was read \by sita.");
		System.out.println("D\\Desktop\\Folder");
		System.out.println();
	
		
	}
}
