package com.java.entities;

public class Hr extends Employee {

	private double gratuityPayment;

	public Hr() {
	}

	public Hr(int id, String name, double basicPayment, double daPayment, double hraPayment, double gratuityPayment) {
		super(id, name, basicPayment, daPayment, hraPayment);
		this.gratuityPayment = gratuityPayment;
	}

	public double getGratuityPayment() {
		return gratuityPayment;
	}

	public void setGratuityPayment(double gratuityPayment) {
		this.gratuityPayment = gratuityPayment;
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + gratuityPayment;
	}

}
