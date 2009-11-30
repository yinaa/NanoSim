package com.nanosim.client.rpc;

import com.nanosim.model.Budget;
import com.google.gwt.user.client.rpc.AsyncCallback;


public interface TransferServiceAsync {
	public void insertBudget(Budget b, AsyncCallback<Budget> callback);
}
