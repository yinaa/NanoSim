package com.nanosim.util;

import java.sql.ResultSet;

public interface ISqlHelper {

	ResultSet executeQuery(String sql, Object... params) throws Exception;

	int executeUpdate(String sql, Object... params) throws Exception;

	Object executeUpdate(String sql, Object[] params, String idQuery, Object[] id) throws Exception;

	void close();

	public static class Factory {
		public static ISqlHelper getInstance() {
			return new MySqlHelper();
		}
	}
}
