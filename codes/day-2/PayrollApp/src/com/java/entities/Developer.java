package com.java.entities;

public class Developer extends Employee {

	private double incentivePayment;

	public Developer() {

	}

	public Developer(int id, String name, double basicPayment, double daPayment, double hraPayment,
			double incentivePayment) {
		super(id, name, basicPayment, daPayment, hraPayment);
		this.incentivePayment = incentivePayment;
	}

	public double getIncentivePayment() {
		return incentivePayment;
	}

	public void setIncentivePayment(double incentivePayment) {
		this.incentivePayment = incentivePayment;
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + this.incentivePayment;
	}

}
