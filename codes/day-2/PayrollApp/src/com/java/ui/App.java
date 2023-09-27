package com.java.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.entities.Developer;
import com.java.entities.Employee;
import com.java.entities.Hr;

public class App {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int count = getRecordCount(scanner);
			Employee[] employees = new Employee[count];
			saveEmployeeInStorage(employees, scanner);
			scanner.close();
			printEmployeeSalary(employees);
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printEmployeeSalary(Employee[] employees) {
		for (Employee employee : employees) {
			if (employee != null)
				System.out.println(employee.getName() + " has got salary of " + employee.calculateSalary());
		}
	}

	private static void saveEmployeeInStorage(Employee[] employees, Scanner sc) {
		for (int i = 0; i < employees.length; i++) {
			printMenu();
			int choice = getChoice(sc);
			Employee employee = createEmployee(choice, sc);
			// boolean doesExist = doesEmployeeExist(employee.getId(), employees);
			boolean doesExist = doesEmployeeExist(employee, employees);
			if (!doesExist)
				employees[i] = employee;
			else
				System.out.println("employee with " + employee.getId() + " already exists");
		}
	}

	// in this case you need to override equals() method in Employee class
	private static boolean doesEmployeeExist(Employee other, Employee[] employees) {
		boolean status = false;
		if (employees.length > 0) {
			for (Employee current : employees) {
				if (current != null) {
					if (current.equals(other)) {
						status = true;
						break;
					}
				}
			}
		}
		return status;
	}

	// in this case there is no need to override equals() method in Employee class
	private static boolean doesEmployeeExist(int id, Employee[] employees) {
		boolean status = false;
		if (employees.length > 0) {
			for (Employee employee : employees) {
				if (employee != null) {
					if (employee.getId() == id) {
						status = true;
						break;
					}
				}
			}
		}
		return status;
	}

	private static Employee createEmployee(int choice, Scanner sc) {
		try {
			System.out.print("\nenter name: ");
			String name = sc.next();

			System.out.print("enter id: ");
			int id = sc.nextInt();

			System.out.print("enter basic payment: ");
			double basicPay = sc.nextDouble();

			System.out.print("enter da payment: ");
			double daPay = sc.nextDouble();

			System.out.print("enter hra payment: ");
			double hraPay = sc.nextDouble();

			Employee employee = null;
			switch (choice) {
			case 1:
				System.out.print("enter gratuity payment: ");
				double gratuityPay = sc.nextDouble();
				employee = new Hr(id, name, basicPay, daPay, hraPay, gratuityPay);
				/*
				 * employee = new Hr(); employee.setName(name); employee.setId(id);
				 * employee.setBasicPayment(basicPay); employee.setDaPayment(daPay);
				 * employee.setHraPayment(hraPay); ((Hr)
				 * employee).setGratuityPayment(gratuityPay);
				 */
				break;

			case 2:
				System.out.print("enter incentive payment: ");
				double incentivePay = sc.nextDouble();
				employee = new Developer(id, name, basicPay, daPay, hraPay, incentivePay);
				break;

			default:
				break;
			}

			return employee;
		} catch (InputMismatchException e) {
			throw e;
		}
	}

	private static int getChoice(Scanner sc) {
		System.out.print("\nenter choice[1/2]: ");
		return sc.nextInt();
	}

	private static void printMenu() {
		System.out.println("1. create hr object");
		System.out.println("2. create developer object");
	}

	static int getRecordCount(Scanner sc) {
		System.out.println("ho wmany records? ");
		return sc.nextInt();
	}
}
