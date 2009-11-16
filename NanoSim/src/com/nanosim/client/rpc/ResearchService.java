package com.nanosim.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("ResearchService")
public interface ResearchService extends RemoteService {
	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static ResearchServiceAsync instance;
		public static ResearchServiceAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(ResearchService.class);
			}
			return instance;
		}
	}
}
