package com.variables;
import java.util.Scanner;
public class Practice {
	int a = 20;
	static int b = 10;
//	public static void main(String[] args) {
//		Practice obj = new Practice();
//		System.out.println(obj.a);
//		System.out.println(b);
//		System.out.println(obj.b);
//		obj.a = 100;
//		obj.b = 200;
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		System.out.println(b);
//	}
	public static void main(String args[])
	{
		//10
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int num1 = 2;
//		int num2 = 3;
//		int num3;
//		System.out.print(num1+" "+num2);
//		for(int i=1;i<=n;i++) {
//			num3 = num1+num2;
//			System.out.print(" "+(num3+num2));
//			
//			
//			
//		}
		
		//11
//		Scanner sc = new Scanner(System.in);
//	    int x1 = sc.nextInt();
//	    int y1 = sc.nextInt();
//	    int x2 = sc.nextInt();
//	    int y2 = sc.nextInt();
//	    float mid1 = (float)(x1+x2)/2;
//	    float mid2 = (float)(y1+y2)/2;
//	    System.out.printf("Binoy's house is located at " + "(" +mid1 +"," + mid2+ ")" );
	    
//		System.out.println(x);
        
		
		Scanner sc = new Scanner(System.in);
        int wlen = sc.nextInt();
        int wbre = sc.nextInt();
        
        //first painting length and breadth
        int plen = sc.nextInt();
        int pbre = sc.nextInt();
        
        //second painting length and breadth
        int p_len = sc.nextInt();
        int p_bre = sc.nextInt();
        
        int area = wlen*wbre-(3*wlen);
        int first_paint = plen*pbre;
        int second_paint = p_len*p_bre;
        int total = first_paint + second_paint;
        if(total<area)
            System.out.println("Karthi can fix both painting");
        else
            System.out.println("Karthi cannot fix both painting");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
