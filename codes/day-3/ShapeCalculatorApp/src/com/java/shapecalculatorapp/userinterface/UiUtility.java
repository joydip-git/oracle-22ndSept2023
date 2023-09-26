package com.java.shapecalculatorapp.userinterface;

import java.util.Scanner;

import com.java.shapecalculatorapp.entities.Circle;
import com.java.shapecalculatorapp.entities.Shape;
import com.java.shapecalculatorapp.entities.Triangle;

public final class UiUtility {

	private static Scanner scanner;
	static {
		scanner = new Scanner(System.in);
	}

	public static int getRecordCount() {
		System.out.print("enter number of shapes to create: ");
		return scanner.nextInt();
	}

	public static void saveShapesInStorage(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {

			// 1. show user a menu about creating shapes
			showMenu();

			// 2. ask user for choice
			int choice = getChoice();

			// 3. based on user choice, create instance of any shape
			Shape shape = createShape(choice);

			// 4. save that instance in the array
			shapes[i] = shape;
		}
	}

	public static void calculateAndPrintArea(Shape[] shapes) {
		for (Shape shape : shapes) {
			if (shape != null) {
				double area = shape.calculateArea();
				Class<?> shapeClsInfo = shape.getClass();
				System.out.println("Area of " + shapeClsInfo.getName() + " is " + area);
			}
		}
	}

	private static Shape createShape(int choice) {

		Shape shape = null;

		switch (choice) {
		case 1:
			System.out.print("enter radius: ");
			double radius = scanner.nextDouble();
			shape = new Circle(radius);
			break;

		case 2:
			System.out.print("enter base: ");
			double base = scanner.nextDouble();

			System.out.print("enter height: ");
			double height = scanner.nextDouble();

			shape = new Triangle(base, height);
			break;

		default:
			break;
		}

		return shape;
	}

	private static void showMenu() {
		System.out.println("\n1. create object of Circle");
		System.out.println("\n2. create object of Triangle");
	}

	private static int getChoice() {
		System.out.print("\nenter a choice[1/2]: ");
		return scanner.nextInt();
	}
	public static void dispose() {
		scanner.close();
	}
}
