package com.nanosim.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.nanosim.model.Group;
import com.nanosim.model.GroupType;

@RemoteServiceRelativePath("GroupService")
public interface GroupService extends RemoteService {
	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static GroupServiceAsync instance;
		public static GroupServiceAsync getInstance(){
			if (instance == null) {
				instance = GWT.create(GroupService.class);
			}
			return instance;
		}
	}
	
	Group getGroup(long groupId);
	GroupType getGroupType(long groupTypeId);
}
