package com.java.sortingdemo.userinterface;

import java.util.Comparator;

import com.java.ssortingdemo.entities.Person;

public class PersonComparer implements Comparator<Person> {

	private int sortChoice;

	public PersonComparer() {
		// TODO Auto-generated constructor stub
	}

	public PersonComparer(int choice) {
		sortChoice = choice;
	}

	@Override
	public int compare(Person o1, Person o2) {
		if (o1 == o2)
			return 0;

//		if (o1.getId() - o2.getId() == 0)
//			if (o1.getName().compareTo(o2.getName()) == 0)
//				return (int) (o1.getSalary() - o2.getSalary());
//			else
//				return o1.getName().compareTo(o2.getName());
//		else
//			return o1.getId() - o2.getId();

		int result = 0;
		switch (sortChoice) {
		case 1:
			result = o1.getId() - o2.getId();
			break;

		case 2:
			result = o1.getName().compareTo(o2.getName());
			break;

		case 3:
			result = (int) (o1.getSalary() - o2.getSalary());
			break;

		default:
			break;
		}
		return result;
	}
}
