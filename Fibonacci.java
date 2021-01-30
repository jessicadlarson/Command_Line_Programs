package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);	
		
		// Ask user to enter the Fibonacci number
		System.out.println("Please enter the Fibonacci number:");
		// Recording user's input
		String user = input.nextLine();
		// Change user input from a string to an integer
		int userInput = Integer.parseInt(user);
		// declaring the first two numbers in the sequence
		int num1 = 0;
		int num2 = 1;
		String result = num1 + ", "+ num2;
		int num3;
		// Fibonacci loop is { c = a + b then a = b, b = c }
		
		//loop starts from 2 because 0 are already stored
		for (int i = 2; i < userInput; i++) {
		num3 = num1 + num2;
		if(num3 < userInput) {
			result += ", " + num3;
			num1 = num2;
			num2 = num3;
		}
		}
		System.out.println(result);
		
		input.close();
	}

}
