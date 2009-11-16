package com.nanosim.client;

import java.util.Date;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DBConnectionAsync{
	
	public void insertBudget(Date d, Double c, AsyncCallback<Budget> callback);

}
