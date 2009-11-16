package com.nanosim.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("PatentService")
public interface PatentService extends RemoteService {
	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static PatentServiceAsync instance;
		public static PatentServiceAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(PatentService.class);
			}
			return instance;
		}
	}
}
