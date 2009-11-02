package com.nanosim.gwt.client;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;


/**
 * Composite that represents a collection of <code>Task</code> items.
 */

public class SendFund extends Composite{
	public SendFund() {
		SimplePanel panel = new SimplePanel();
		VerticalPanel list = new VerticalPanel();
		panel.setWidget(list);
		list.add(new CheckBox("See the status"));
		list.add(new CheckBox("Send Fund"));
		initWidget(panel);
		setStyleName("nanosim-Research");
	}
	
	public void insertDatabase(Double credit){
		 String url = "jdbc:mysql://localhost:3306/nanosim";
		 //System.out.println(com.mysql.jdbc.Driver.HOST_NAME_INDEX);
		    try {
		      Class.forName("com.mysql.jdbc.Driver").newInstance();
		    }
		    catch( Exception e ) {
		      System.out.println("Failed to load mSQL driver." + e.toString());
		      return;
		    }
		    try {
		      Connection con = DriverManager.getConnection(url, "root", "");
		      //Statement select = con.createStatement();
		     // ResultSet result = select.executeQuery
		      con.setAutoCommit(false);
		      PreparedStatement updateSales = con.prepareStatement(
		          "INSERT Budgets SET time = ? AND credit = ?");
		      Date date=new Date();
		      SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yy");
		      String strDate=sdf.format(date);
		      updateSales.setString(1, strDate);
		      updateSales.setDouble(2, credit);
		      updateSales.executeUpdate();
		      con.commit();
		      con.setAutoCommit(true);

		    }catch(Exception e){
		    	System.out.println("Error: "+e.toString());
		    }
	}
	
}
