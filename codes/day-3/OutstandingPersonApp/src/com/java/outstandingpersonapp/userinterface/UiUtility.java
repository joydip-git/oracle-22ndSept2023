package com.java.outstandingpersonapp.userinterface;

import java.util.Scanner;

import com.java.outstandingpersonapp.entities.Person;
import com.java.outstandingpersonapp.entities.Professor;
import com.java.outstandingpersonapp.entities.Student;

public final class UiUtility {
	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	public static int getRecordCount() {
		System.out.print("enter number of records: ");
		return scanner.nextInt();
	}

	public static void savePersonInStorage(Person[] people) {
		for (int i = 0; i < people.length; i++) {
			// 1. show user a menu about creating either Student or Professor object
			showMenu();

			// 2. ask user for choice
			int choice = getChoice();
			// 3. based on user choice, create instance of either Student or Professor
			Person person = createPerson(choice);

			// 4. save that instance in the array
			people[i] = person;
		}
	}

	public static void printOustandingPeople(Person[] people) {
		for (Person person : people) {
			if (person != null) {
				if (person.isOutstanding()) {
					if (person instanceof Student) {
						Student student = (Student) person;
						System.out
								.println(student.getName() + ", with marks " + student.getMarks() + ", is outstanding");
					}
					if (person instanceof Professor) {
						Professor professor = (Professor) person;
						System.out.println(professor.getName() + ", with " + professor.getBooksPublished()
								+ " published books, is outstanding");
					}
				}
			}
		}
	}

	private static Person createPerson(int choice) {
		System.out.print("\nenter name: ");
		String name = scanner.next();

		Person person = null;

		switch (choice) {
		case 1:
			System.out.print("enter marks for student: ");
			int marks = scanner.nextInt();
			person = new Student(name, marks);
			break;

		case 2:
			System.out.print("enter number of books published: ");
			int booksCount = scanner.nextInt();
			person = new Professor(name, booksCount);
			break;

		default:
			break;
		}

		return person;
	}

	private static int getChoice() {
		System.out.print("\nenter a choice[1/2]: ");
		return scanner.nextInt();
	}

	private static void showMenu() {
		System.out.println("\n1. create object of student");
		System.out.println("\n2. create object of Professor");
	}

	/*
	@Override
	// protected void finalize() throws Throwable {
	public void finalize() throws Throwable {
		System.out.println("cleaning up resource");
		super.finalize();
		scanner.close();
	}
	*/
	
	public static void dispose() {
		scanner.close();
	}
}
