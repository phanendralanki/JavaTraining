package com.strings;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		//1st remove "the" occurrences 
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		System.out.println(a);
//		System.out.println(a.replace("the",""));
		
		//2nd string length
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		System.out.println("The length of word "+s+" is "+s.length());
		
		//3rd- Automated dictionary  
		//i/p - Excellent Excellent
		/*
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if((s1.length()<=50)&&(s2.length()<=50)){
			if(s1.equals(s2))
				System.out.println("It is correct");
		}else
				System.out.println("It is wrong");
		
		*/
	
		//String methods practice
		/*
		String str = "Hello";
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.codePointAt(0)); //ASCII value
		
		System.out.println(str.indexOf("e")); 
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Hello");
		*/
		
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        String lab = sc.next();
        
        if(lab=="L1"){
            if(y<z) {
                System.out.println("L2");
            }
            else { 
                System.out.println("L3");
            }
        }
        else if(lab=="L2"){
            if(x<z) {
                System.out.println("L1");
            }
            else {
                System.out.println("L3");
            }
        }
        else{
            if(x<y)
                System.out.println("L1");
            else
                System.out.println("L2");
        }
		
	}
}
