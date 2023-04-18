package com.xworkz.fruit.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) {
    try (Connection  connection=DriverManager.getConnection("jdbc:mysql://Localhost:3306/usingjava", "root","Xworkzodc@123")){
    	String sql="Select * from fruit_table fruit";
    	Statement statement=connection.createStatement();
    	ResultSet resultSet=statement.executeQuery(sql);
    	while(resultSet.next()) {
    		int id=resultSet.getInt("f_id");
    		String name=resultSet.getString("f_name");
    		String color=resultSet.getString("f_color");
    		int price=resultSet.getInt("f_price");
    		boolean tasty=resultSet.getBoolean("f_tasty");
    		
    		System.out.println("ID :"+id + "Name :"+name +"Color : "+color+ "Price :"+price+"Tasty :"+tasty);
    	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
