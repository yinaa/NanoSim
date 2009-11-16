package com.nanosim.model;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Budget implements IsSerializable {
	private Date time;
	private double credit;

	private Budget(){
		//just here because GWT wants it
	}
	public Budget(Date t, double c){
		this.time = t;
		this.credit = c; 
	}
}
