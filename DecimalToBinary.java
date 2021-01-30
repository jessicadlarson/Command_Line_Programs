package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		// Ask user to enter a series of decimal values separated by spaces:
		System.out.println("Please enter in a series of decimal values (separated by spaces):");
		String value = input.nextLine();
		String [] decimalValueArray = value.split(" ");
		
		for (int i = 0; i < decimalValueArray.length; i++) {
			int count = Integer.parseInt(decimalValueArray[i]);
			String intToBinary = Integer.toBinaryString(count);
			
			System.out.println(count + " in binary is " + intToBinary);
		}
		
		 
		input.close();
	}

}
