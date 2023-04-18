package com.xworkz.fruit.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsert {

	public static void main(String[] args) {
      try(Connection connection=DriverManager.getConnection("jdbc:mysql://Localhost:3306/usingjava", "root","Xworkzodc@123")){
    	  String insertQuery="Insert into fruit_table values(?,?,?,?,?)";
    	  
    	  PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
    	  preparedStatement.setInt(1, 0);
    	  preparedStatement.setString(2,"Kivi");
    	  preparedStatement.setString(3, "Brwon");
    	  preparedStatement.setInt(4, 200);
    	  preparedStatement.setBoolean(5, false);
    	   
    	  int rowsAffected=preparedStatement.executeUpdate();
    	  System.out.println("rowsAffected "+rowsAffected);
      }
      catch(SQLException e){
    	  System.out.println("SQLException");
    	  
    	  
      }
    		  
	}

}
