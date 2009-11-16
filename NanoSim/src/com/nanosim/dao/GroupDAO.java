package com.nanosim.dao;

import java.sql.ResultSet;

import com.nanosim.model.Group;
import com.nanosim.model.GroupType;
import com.nanosim.util.ISqlHelper;

public class GroupDAO {

	ISqlHelper sqlHelper = ISqlHelper.Factory.getInstance();

	public Group getGroupById(long groupId) {
		ResultSet rs = null;
		try {
			rs = sqlHelper.executeQuery(String.format(
					"select * from groups where group_id = %s", groupId));
			Group g = new Group();
			if (rs.next()) {
				g.setGroupId(groupId);
				g.setName(rs.getString("name"));
				g.setGroupTypeId(rs.getLong("group_type_id"));
				g.setObjective(rs.getString("objective"));
				g.setBudget(rs.getDouble("budget"));
			}
			return g;
		} catch (Exception e) {
			return null;
		} finally {
			if (rs != null)
				sqlHelper.close();
		}
	}

	public GroupType getGroupTypeById(long groupTypeId) {
		ResultSet rs = null;
		try {
			rs = sqlHelper.executeQuery(String.format(
					"select * from group_types where group_type_id = %s",
					groupTypeId));
			GroupType g = new GroupType();
			if (rs.next()) {
				g.setGroupTypeId(groupTypeId);
				g.setName(rs.getString("name"));
				g.setHasBusiness(rs.getString("has_business").equals("y"));
				g.setHasCertificates(rs.getString("has_certificates").equals(
						"y"));
				g.setHasFacilities(rs.getString("has_facilities").equals("y"));
				g.setHasPatents(rs.getString("has_patents").equals("y"));
				g.setHasResearch(rs.getString("has_research").equals("y"));
				g.setHasReview(rs.getString("has_review").equals("y"));
				g.setNewspaper(rs.getString("newspaper").equals("y"));
				g.setResearchAvailability(rs.getString("research_availability")
						.equals("y"));
				g.setViewAllBudgets(rs.getString("view_all_budgets")
						.equals("y"));
			}
			return g;
		} catch (Exception e) {
			return null;
		} finally {
			if (rs != null)
				sqlHelper.close();
		}
	}
}
