package com.java.outstandingpersonapp.entities;

public final class Student extends Person {

	private double marks;

	public Student() {

	}

	public Student(String name, double marks) {
		super(name);
		this.setMarks(marks);
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public boolean isOutstanding() {
		return marks >= 85;
	}

}
