package com.java.ui;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rowAndColumnsCount = getMatrixRowsAndColumns(scanner);
		int[][] matrixArray = new int[rowAndColumnsCount][rowAndColumnsCount];

		enterValuesInArray(scanner, matrixArray);

		scanner.close();

		int[] temporaryArray = convertToSingleDimensionalArray(matrixArray);
		Arrays.sort(temporaryArray);

		int[] resultantArray = createArrayAndArrangeElements(temporaryArray);
		ptintElements(resultantArray);
	}

	static int getMatrixRowsAndColumns(Scanner scanner) {
		System.out.println("enter no of rows and columns for two dimensional matrix array: ");
		return scanner.nextInt();
	}

	private static void enterValuesInArray(Scanner scanner, int[][] matrixArray) {
		for (int i = 0; i < matrixArray.length; i++) {
			for (int j = 0; j < matrixArray.length; j++) {
				System.out.println("enter value at matrixArray[" + i + "][" + j + "]: ");
				matrixArray[i][j] = scanner.nextInt();
			}
		}
	}

	static int[] convertToSingleDimensionalArray(int[][] matrix) {
		int[] single = new int[matrix.length * matrix.length];
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				single[index] = matrix[i][j];
				index++;
			}
		}
		return single;
	}

	private static int[] createArrayAndArrangeElements(int[] temporaryArray) {
		int[] result = new int[temporaryArray.length];

		int midPosition = result.length / 2;
		int leftIndex = midPosition - 1;
		int rightIndex = midPosition + 1;

		result[midPosition] = temporaryArray[0];
		for (int i = 1; i < temporaryArray.length; i++) {
			if (i % 2 != 0) {
				result[rightIndex] = temporaryArray[i];
				rightIndex++;
			} else {
				result[leftIndex] = temporaryArray[i];
				leftIndex--;
			}
		}
		return result;
	}

	private static void ptintElements(int[] resultantArray) {
		for (int i : resultantArray) {
			System.out.print(i + " ");
		}
	}

}
