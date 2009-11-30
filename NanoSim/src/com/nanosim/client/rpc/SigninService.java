package com.nanosim.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.nanosim.model.Person;


@RemoteServiceRelativePath("SigninService")
public interface SigninService extends RemoteService {
	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static SigninServiceAsync instance;
		public static SigninServiceAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(SigninService.class);
			}
			return instance;
		}
	}
	
	Person signin(String userName, String password);
}
