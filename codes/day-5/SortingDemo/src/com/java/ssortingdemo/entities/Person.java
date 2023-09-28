package com.java.ssortingdemo.entities;

//Comparable<T> is from java.lang package
public class Person implements Comparable<Person> {
	private String name;
	private int id;
	private double salary;

	public Person() {
	}

	public Person(int id, String name, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + ", " + id + ", " + salary;
	}

	@Override
	public int compareTo(Person o) {
		if (this == o)
			return 0;
		
		if (this.id - o.id == 0)
			if (this.name.compareTo(o.name) == 0)
				return (int) (this.salary - o.salary);
			else
				return this.name.compareTo(o.name);
		else
			return this.id - o.id;
	}
}
