package com.xworkz.fruit.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObject = DriverManager.getConnection("jdbc:mysql://Localhost:3306/usingjava", "root","Xworkzodc@123");
			String insertQuery = "Insert into fruit_table values (0,'apple','red',200,true)";
			String updateQuery = "update fruit_table set f_name='Orange' ,f_color='Orange' where f_id=13";
			String deleteQuery = "delete from fruit_table where f_id=2";
			Statement statement = conObject.createStatement();
			Statement statement2 = conObject.createStatement();

			int rowsAffected = statement.executeUpdate(insertQuery);
			int updatedQuery = statement2.executeUpdate(updateQuery);
			int deletedQuery = statement2.executeUpdate(deleteQuery);

			System.out.println("rowsAffected  " + rowsAffected);
			System.out.println("updateQuery " + updatedQuery);
			System.out.println("deletedQuery " + deletedQuery);

			conObject.close();

		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException..." + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLException..." + e.getMessage());

		}

	}

}
