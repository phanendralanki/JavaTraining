package com.oops;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     int height = in.nextInt();
     int width = in.nextInt();

     for(int i=1;i<=height;i++){
         System.out.print("O");
     }
     System.out.println();
     for(int i=1;i<=height;i++){
         System.out.print("O");
     }
	}
}
