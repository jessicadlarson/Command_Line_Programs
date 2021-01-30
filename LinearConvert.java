package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		// Ask user to enter a length
		System.out.println("Please enter the length:");
		String valueLength = input.nextLine();
		double length = Double.parseDouble(valueLength);
		
		// Ask user if measurement is in meter or feet
		System.out.println("Is the measurement in (m)eter or (f)eet:");
		String valueMeasurement = input.nextLine();	
		
		if (valueMeasurement.equals("f") || valueMeasurement.equals("F")) {
			System.out.println(length + "f is " + (length * 0.3048) + "m." );
		} else if (valueMeasurement.equals("m") || valueMeasurement.equals("M")) {
			System.out.println(length + "m is " + (length * 3.2808399) + "f." );
		} else {
			System.out.println("Error! Please enter m or f when asked what measurement type the length is.");
		}
	
		input.close();
	}

}
