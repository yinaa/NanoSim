package com.nanosim.dao;

import com.nanosim.model.Person;
import com.nanosim.util.ISqlHelper;
import java.sql.ResultSet;

public class PersonDAO {

	ISqlHelper sqlHelper = ISqlHelper.Factory.getInstance();

	public Person signin(String userName, String password) {
		ResultSet rs = null;
		try {
			rs = sqlHelper
					.executeQuery(String
							.format(
									"select * from persons where name = '%s' and password='%s'",
									userName, password));
			Person p = new Person();
			if (rs.next()) {
				p.setPersonId(rs.getLong("person_id"));
				p.setName(rs.getString("name"));
				p.setGroupId(rs.getLong("group_id"));
			}
			return p;
		} catch (Exception e) {
			return null;
		} finally {
			if (rs != null)
				sqlHelper.close();
		}
	}
}
