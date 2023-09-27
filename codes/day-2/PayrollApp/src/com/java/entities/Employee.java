package com.java.entities;

import java.util.InputMismatchException;

public class Employee {

	private int id;
	private String name;
	private double basicPayment;
	private double daPayment;
	private double hraPayment;

	public Employee() {
	}

	public Employee(int id, String name, double basicPayment, double daPayment, double hraPayment) {
		super();
		this.id = id;
		this.name = name;
		/*
		 * this.basicPayment = basicPayment; this.daPayment = daPayment; this.hraPayment
		 * = hraPayment;
		 */
		this.setBasicPayment(basicPayment);
		this.setDaPayment(daPayment);
		this.setHraPayment(hraPayment);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(double basicPayment) {
		try {
			if (isPostiveeValue(basicPayment))
				this.basicPayment = basicPayment;
		} catch (Exception e) {
			throw e;
		}
	}

	public double getDaPayment() {
		return daPayment;
	}

	public void setDaPayment(double daPayment) {
		try {
			if (isPostiveeValue(daPayment))
				this.daPayment = daPayment;
		} catch (Exception e) {
			throw e;
		}
	}

	public double getHraPayment() {
		return hraPayment;
	}

	public void setHraPayment(double hraPayment) {
//		if (isPostiveeValue(hraPayment))
//			this.hraPayment = hraPayment;
		try {
			if (isPostiveeValue(hraPayment))
				this.hraPayment = hraPayment;
		} catch (Exception e) {
			throw e;
		}
	}

	public double calculateSalary() {
		return basicPayment + daPayment + hraPayment;
	}

	@Override
	public boolean equals(Object arg0) {
		if (this == arg0) {
			return true;
		}

		if (arg0 instanceof Employee) {
			Employee other = (Employee) arg0;
			return this.id == other.id;
		} else
			return false;
	}

	public boolean isPostiveeValue(double value) {
		if (value < 0) {
			System.out.println(value);
			InputMismatchException e = new InputMismatchException("no negative value allowed");
			throw e;
		}
		return true;
	}
}
