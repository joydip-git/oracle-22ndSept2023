package com.java.sortingdemo.userinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.java.ssortingdemo.entities.Person;

public class App {

	public static void main(String[] args) {
		Person sunilPerson = new Person(2, "sunil", 1000);
		Person joydipPerson = new Person(1, "joydip", 3000);
		Person anilPerson = new Person(3, "anil", 2000);

//		if (sunilPerson.compareTo(anilPerson) == 0) {
//			System.out.println("anil and sunil are same");
//		} else if (sunilPerson.compareTo(anilPerson) > 0) {
//			System.out.println("sunil is greater than anil");
//		} else {
//			System.out.println("anil is greater than sunil");
//		}

//		PersonComparer comparer = new PersonComparer();
//		if (comparer.compare(sunilPerson, anilPerson) == 0) {
//			System.out.println("anil and sunil are same");
//		} else if (comparer.compare(sunilPerson, anilPerson) > 0) {
//			System.out.println("sunil is greater than anil");
//		} else {
//			System.out.println("anil is greater than sunil");
//		}

		List<Person> people = new ArrayList<>();
		people.add(sunilPerson);
		people.add(joydipPerson);
		people.add(anilPerson);

		// in this case, the sort method is expecting that Person class has implemented
		// Comaparable<T> interface and implemented compareTo(T o) method of the
		// interface
		// because sort method will call compareTo method on one object in the
		// collection and pass another object as an argument from the collection
		// Collections.sort(people);

		System.out.println("1. sort by id\n2. sort by name\n3. sort by salary");
		System.out.print("\nenter choice: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		// in this case, the sort method is expecting that a new class has implemented
		// Comparator<T> interface and implemented compare(T o1, T o2) method of the
		// interface because sort method will call compare method of that object of the
		// class which implemented the interface, and will pass two objects of the same
		// type to that method

		// PersonComparer comparer = new PersonComparer();
		PersonComparer comparer = new PersonComparer(choice);
		Collections.sort(people, comparer);

		for (Person person : people) {
			System.out.println(person);
		}
	}
}
