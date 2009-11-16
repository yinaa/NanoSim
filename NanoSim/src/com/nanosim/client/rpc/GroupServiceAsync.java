package com.nanosim.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.nanosim.model.Group;
import com.nanosim.model.GroupType;

public interface GroupServiceAsync {

	void getGroup(long groupId, AsyncCallback<Group> callback);

	void getGroupType(long groupTypeId, AsyncCallback<GroupType> callback);
}
