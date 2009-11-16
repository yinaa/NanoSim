package com.nanosim.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("ProposalService")
public interface ProposalService extends RemoteService {
	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static ProposalServiceAsync instance;
		public static ProposalServiceAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(ProposalService.class);
			}
			return instance;
		}
	}
}
