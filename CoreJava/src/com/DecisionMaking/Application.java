package com.DecisionMaking;
import java.util.*;
public class Application {
	public static void main(String[] args) {
		String admin = "admin";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your role");
		String role = sc.nextLine();
		if(role==admin) {
			System.out.println("Hello,Admin!");
		}else if(role=="guest") {
			System.out.println("Hello,Guest!");
		}else {
			System.out.println("Invalid login");
		}
//		sc.close();
	}
}
