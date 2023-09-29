package com.java.jdbcapp.userinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
		// getAllRecords();
		getSingleRecord();
		// insertRecord();
		// updateRecord();
		// deleteRecord();
	}

	static void deleteRecord() {
		Connection connection = null;
		PreparedStatement statement = null;
		String query = "delete from employees where employee_id=?";
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle2023");
			statement = connection.prepareStatement(query);
			statement.setInt(1, 10);

			result = statement.executeUpdate();
			System.out.println(result > 0 ? "deleted" : "not deleted");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	static void updateRecord() {
		Connection connection = null;
		PreparedStatement statement = null;
		String query = "update employees set employee_name=? where employee_id=?";
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle2023");
			statement = connection.prepareStatement(query);
			statement.setInt(2, 10);
			statement.setString(1, "Naman Garg");

			result = statement.executeUpdate();
			System.out.println(result > 0 ? "updated" : "not updated");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	static void insertRecord() {
		Connection connection = null;
		PreparedStatement statement = null;
		String query = "insert into employees(employee_id, employee_name) values(?,?)";
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle2023");
			statement = connection.prepareStatement(query);
			statement.setInt(1, 10);
			statement.setString(2, "Naman");

			result = statement.executeUpdate();
			System.out.println(result > 0 ? "added" : "not added");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	static void getAllRecords() {
		Connection connection = null;
		Statement statement = null;
		ResultSet setOfRecords = null;
		String query = "select employee_id, employee_name from employees";
		try {
			// loading OracleDriver class from ojdbc8.jar file dynamically using class
			// loader
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// create a connection between your application and database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle2023");
			statement = connection.createStatement();
			// executeQuery method is used execute SELECT statement
			setOfRecords = statement.executeQuery(query);
			while (setOfRecords.next()) {
				// int id = setOfRecords.getInt(1);
				// String name = setOfRecords.getString(2);
				int id = setOfRecords.getInt("employee_id");
				String name = setOfRecords.getString("employee_name");
				System.out.println(id + ":" + name);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	static void getSingleRecord() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet setOfRecords = null;
		String query = "select employee_id, employee_name from employees where employee_id=?";
		try {
			// loading OracleDriver class from ojdbc8.jar file dynamically using class
			// loader
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// create a connection between your application and database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle2023");
			statement = connection.prepareStatement(query);
			statement.setInt(1, 9);

			// executeQuery method is used execute SELECT statement
			setOfRecords = statement.executeQuery();

			while (setOfRecords.next()) {
				// int id = setOfRecords.getInt(1);
				// String name = setOfRecords.getString(2);
				int id = setOfRecords.getInt("employee_id");
				String name = setOfRecords.getString("employee_name");
				System.out.println(id + ":" + name);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
