package com.java.shapecalculatorapp.userinterface;

import com.java.shapecalculatorapp.entities.Shape;
import com.java.shapecalculatorapp.userinterface.UiUtility;

public class App {

	public static void main(String[] args) {
		// 1. get the count of records from user
		int count = UiUtility.getRecordCount();

		// 2. create an array with the count as the length of the array
		Shape[] shapes = new Shape[count];

		// 3. create any instance of any shape, one at a time, based on user choice and
		// save the same in the array
		UiUtility.saveShapesInStorage(shapes);

		// 4. iterate through the array and calculate area of every shape and print the
		// area with the shape name
		UiUtility.calculateAndPrintArea(shapes);

		UiUtility.dispose();
	}

}
