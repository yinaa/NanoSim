package com.nanosim.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("NewspaperService")
public interface NewspaperService extends RemoteService {
	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static NewspaperServiceAsync instance;
		public static NewspaperServiceAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(NewspaperService.class);
			}
			return instance;
		}
	}
}
