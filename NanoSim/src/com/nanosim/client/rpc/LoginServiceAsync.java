package com.nanosim.client.rpc;

import com.nanosim.model.Person;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
	void signin(String userName, String password, AsyncCallback<Person> callback);
}
