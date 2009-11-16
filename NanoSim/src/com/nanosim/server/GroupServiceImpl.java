package com.nanosim.server;

import com.nanosim.client.rpc.GroupService;
import com.nanosim.dao.GroupDAO;
import com.nanosim.model.Group;
import com.nanosim.model.GroupType;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class GroupServiceImpl extends RemoteServiceServlet implements
		GroupService {

	private static final long serialVersionUID = 1599752535430264095L;

	@Override
	public Group getGroup(long groupId) {
		try {
			GroupDAO groupDao = new GroupDAO();
			return groupDao.getGroupById(groupId);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public GroupType getGroupType(long groupTypeId) {
		try {
			GroupDAO groupDao = new GroupDAO();
			return groupDao.getGroupTypeById(groupTypeId);
		} catch (Exception e) {
			return null;
		}
	}
}
