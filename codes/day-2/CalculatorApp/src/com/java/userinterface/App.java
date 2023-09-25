package com.java.userinterface;

import java.util.Scanner;
import com.java.logic.Calculation;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			// 1. print a menu
			printMenu();

			// 2. ask user for choice
			char choice = getChoice(scanner);

			//terminate the application if the choice is to exit, otherwise continue
			if (choice == 'e') {
				break;
			}

			// 3. ask user to enter two values
			int firstValue = getValue(scanner);
			int secondValue = getValue(scanner);

			//if there is no more input required, close the scanner ASAP
			scanner.close();

			// 4. call the specific method
			int result = calculate(choice, firstValue, secondValue);

			// 5. print the result
			System.out.println("result: " + result);
		}

	}

	static void printMenu() {
		System.out.println("1. enter + to add two numbers");
		System.out.println("2. enter - to subtract two numbers");
		System.out.println("3. enter * to multiply two numbers");
		System.out.println("4. enter / to divide a number by another");
		System.out.println("5. enter e to exit");
	}

	static char getChoice(Scanner scanner) {
		System.out.println("\nenter choice[+,-,*,/,e]: ");
		return scanner.next().charAt(0);
	}

	static int getValue(Scanner scanner) {
		System.out.println("enter value: ");
		return scanner.nextInt();
	}

	static int calculate(char choice, int firstValue, int secondValue) {
		Calculation calculation = new Calculation();
		int result = 0;
		switch (choice) {
		case '+':
			result = calculation.add(firstValue, secondValue);
			break;
		case '-':
			result = calculation.subtract(firstValue, secondValue);
			break;
		case '*':
			result = calculation.multiply(firstValue, secondValue);
			break;
		case '/':
			result = calculation.divide(firstValue, secondValue);
			break;

		default:
			break;
		}
		return result;
	}
}
