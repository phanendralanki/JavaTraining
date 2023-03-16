package com.DecisionMaking;

import java.util.Scanner;

public class UserActivitySelector {
	public static void main(String[] args) {
		System.out.println("please select any option");
		System.out.println("1.login\n2.sign_up\n3.terminate_program\n4.main_menu\n5.about_app");
		Scanner sc = new Scanner(System.in);
		int action = sc.nextInt();
		
		switch(action) {
		case 1:
			System.out.println("please,enter your username");
			break;
		case 2:
			System.out.println("Welcome!");
			break;
		case 3:
			System.out.println("Thank you! Good bye!");
			break;
		case 4:
			System.out.println("Main menu");
			break;
		case 5:
			System.out.println("This app is created by me with support of @IT-Bulls.com");
			break;
		default:
			System.out.println("Please,enter one of these values: login,sign_up,terminate_program,main_menu,about_app");
			
		}
		
		sc.close();
	}
}
