package com.nanosim.client.rpc;

import com.nanosim.model.Group;
import com.nanosim.model.GroupType;
import com.google.gwt.user.client.rpc.AsyncCallback;


public interface GroupServiceAsync {
	void getGroup(long groupId, AsyncCallback<Group> callback);
	void getGroupType(long groupTypeId, AsyncCallback<GroupType> callback);
}
