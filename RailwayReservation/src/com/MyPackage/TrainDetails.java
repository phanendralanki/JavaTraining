package com.MyPackage;

public class TrainDetails extends DisplayDetails{
	public static String startPoint;
	public static String destinationPoint;
	public static String date;
	public static int train1Seats = 1;
	public static int train2Seats = 2;
	public static int train3Seats = 3;
	
	public static void getTrain() {
	System.out.println("\t\t**** Train Details ****\t\t\n");
	System.out.println("startPoint \t Destination \t date \t seatsAvailable");
	System.out.println();
	System.out.println("Narsapuram \t bhimavaram \t 16-03-2023 \t "+train1Seats);
	System.out.println("Narsapuram \t bhimavaram \t 16-03-2023 \t "+train2Seats);
	System.out.println("Narsapuram \t bhimavaram \t 16-03-2023 \t "+train3Seats);
	}
	
	
}
