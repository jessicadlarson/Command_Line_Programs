package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		// Ask user to enter a length
		System.out.println("Please enter the temperature:");
		String valueTemp = input.nextLine();
		double temp = Double.parseDouble(valueTemp);
		
		// Ask user if measurement is in meter or feet
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String eitherOr = input.nextLine();	
		
		if (eitherOr.equals("f") || eitherOr.equals("F")) {
			System.out.println(temp + "F is " + Math.round((temp - 32) / 1.8) + "C." );
		} else if (eitherOr.equals("c") || eitherOr.equals("C")) {
			System.out.println(temp + "C is " + Math.round(temp * 1.8 + 32) + "F." );
		} else {
			System.out.println("Error!");
		}
	
		input.close();
	}

}
