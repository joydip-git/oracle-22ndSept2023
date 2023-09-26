package com.java.shapecalculatorapp.entities;

public final class Triangle implements Shape {

	private double tBase;
	private double tHeight;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(double tBase, double tHeight) {
		super();
		this.tBase = tBase;
		this.tHeight = tHeight;
	}

	public double gettBase() {
		return tBase;
	}

	public void settBase(double tBase) {
		this.tBase = tBase;
	}

	public double gettHeight() {
		return tHeight;
	}

	public void settHeight(double tHeight) {
		this.tHeight = tHeight;
	}

	@Override
	public double calculateArea() {
		return 0.5 * tBase * tHeight;
	}

}
