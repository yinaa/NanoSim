package com.nanosim.client;

import java.util.Date;

import com.google.gwt.user.client.rpc.RemoteService;
import com.nanosim.model.Budget;

public interface DBConnection extends RemoteService{
	
	public Budget insertBudget(Date d, Double c);

}
