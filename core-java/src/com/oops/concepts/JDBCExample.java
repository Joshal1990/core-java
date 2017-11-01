package com.oops.concepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] argv) {

		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;
		Statement statement = null;

		try {

			/*connection = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/testdb", "mkyong",
					"123456");*/
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "event_user", "event_user");
			

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
			
			try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ResultSet resultset = statement.executeQuery("select * from user_auth");
				while (resultset.next()) {
					int int1 = resultset.getInt("age");
					System.out.println(int1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Failed to make connection!");
		}
	}
}
