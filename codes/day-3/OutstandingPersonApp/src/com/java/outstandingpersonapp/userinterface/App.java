package com.java.outstandingpersonapp.userinterface;

import com.java.outstandingpersonapp.entities.Person;

public class App {

	public static void main(String[] args) {
		// 1. get the count of records from user
		int count = UiUtility.getRecordCount();

		// 2. create an array with the count as the length of the array
		Person[] people = new Person[count];

		// 3. create one instance of either Student or Professor at a time, based on
		// user choice and save the same in the array
		UiUtility.savePersonInStorage(people);
		
		// 4. iterate through the array and check which person is outstanding and then
		// display the information of that person only
		UiUtility.printOustandingPeople(people);
	}
}
