package com.nanosim.gwt.client;

import java.util.Date;

import com.google.gwt.user.client.rpc.RemoteService;

public interface DBConnection extends RemoteService{
	
	public Budget insertBudget(Date d, Double c);

}
