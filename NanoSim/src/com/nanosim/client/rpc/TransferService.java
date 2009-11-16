package com.nanosim.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("TransferService")
public interface TransferService extends RemoteService {
	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static TransferServiceAsync instance;
		public static TransferServiceAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(TransferService.class);
			}
			return instance;
		}
	}
}
