package com.MyPackage;

import java.util.Scanner;

public class Booking extends TrainDetails {
	public static int trainNo;
	public static String aadhar;

	public static void bookTicket() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your Aadhar no: ");
		aadhar = sc.next();

		System.out.println("Enter train no: 1/2/3 ");
		trainNo = sc.nextInt();
		if (trainNo == 1) {
			System.out.println("Tickets booked");
		} else if (trainNo == 2) {
			System.out.println("Ticket Booked");
		} else if (trainNo == 3) {
			System.out.println("Ticket Booked");
		} else {
			System.out.println("Invalid option");
		}
		
		
	}
}
