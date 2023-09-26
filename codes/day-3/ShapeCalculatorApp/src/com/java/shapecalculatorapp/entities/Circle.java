package com.java.shapecalculatorapp.entities;

public final class Circle implements Shape {

	private double radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}
