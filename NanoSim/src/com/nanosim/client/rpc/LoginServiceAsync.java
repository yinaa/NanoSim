package com.nanosim.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.nanosim.model.Person;

public interface LoginServiceAsync {
	void signin(String userName, String password, AsyncCallback<Person> callback);
}
