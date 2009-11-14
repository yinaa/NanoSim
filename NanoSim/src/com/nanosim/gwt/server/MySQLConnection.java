package com.nanosim.gwt.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.google.gwt.dev.generator.ast.Statement;
import com.nanosim.gwt.client.Budget;
import com.nanosim.gwt.client.DBConnection;


public class MySQLConnection implements DBConnection {
	public MySQLConnection(){}
	
	/** Uses DriverManager.  */
	  public Connection getConnection() {
		  Connection conn     = null;
          String url          = "jdbc:mysql://localhost:3306/";
          String db           = "nanosim";
          String driver       = "com.mysql.jdbc.Driver";
          String user         = "root";
          String pass         = "";
		  
          try {
              Class.forName(driver).newInstance();
	      } catch (InstantiationException e) {
	              e.printStackTrace();
	      } catch (IllegalAccessException e) {
	              e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	              e.printStackTrace();
	      }
	      try {
	                      
	           	  conn = DriverManager.getConnection(url+db, user, pass);
	      } catch (SQLException e) {
	                      System.err.println("Mysql Connection Error: ");
	              e.printStackTrace();
	      }
	              return conn;
	  }
	  
public Budget insertBudget(Date t, Double c){
	Connection con = this.getConnection();
	try {
		con.setAutoCommit(false);
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	
		try{
			PreparedStatement updateSales = con.prepareStatement(
	          "INSERT Budgets SET time = ? AND credit = ?");
			updateSales.setDate(1, (java.sql.Date) t);
			updateSales.setDouble(2, c);
			updateSales.executeUpdate();
			con.commit();
			
			con.setAutoCommit(true);

	}catch(Exception e){
		System.out.println("Error: "+e.toString());
    }
	  
 return new Budget(t,c); 
	  }

}
