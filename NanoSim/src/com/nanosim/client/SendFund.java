package com.nanosim.client;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Composite that represents a collection of <code>Task</code> items.
 */
public class SendFund extends Composite{
	
	private DBConnectionAsync rpc;
	
	public SendFund() {
		SimplePanel panel = new SimplePanel();
		VerticalPanel list = new VerticalPanel();
		panel.setWidget(list);
		list.add(new CheckBox("See the status"));
		list.add(new CheckBox("Send Fund"));
		initWidget(panel);
		setStyleName("nanosim-Research");
		/*for database*/
		rpc = (DBConnectionAsync) GWT.create(DBConnection.class);
		ServiceDefTarget target = (ServiceDefTarget) rpc;
		// The path 'MySQLConnection' is determined in ./public/LoginScreen.gwt.xml
		// This path directs Tomcat to listen for this context on the server side,
		// thus intercepting the rpc requests.
		String moduleRelativeURL = GWT.getModuleBaseURL() + "MySQLConnection";
		target.setServiceEntryPoint(moduleRelativeURL);
	}
	
	public void insertDatabase(Double credit){
		Date now = new Date();
		System.out.println(now.getTime());
		Budget b[] = new Budget[1];
		b[0] = new Budget(now, credit );
	    
//		AsyncCallback<Budget> callback = new AuthenticationHandler<Budget>();
		//rpc.insertBudget(now, credit, callback);
	}
	
}

class AuthenticationHandler<T> implements AsyncCallback<Budget> {
	public void onFailure(Throwable ex) {
		System.out.println("Fail");
	}
	public void onSuccess(Budget result) {
		System.out.println("Success!");
	//do stuff on success with GUI, like load the next GUI element
	}

	}
