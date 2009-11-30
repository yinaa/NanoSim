package com.nanosim.util;

import java.sql.ResultSet;

public interface ISqlHelper {
    
	//select query
	ResultSet executeQuery(String sql, Object... params) throws Exception;

	//insert, delete, update query
	int executeUpdate(String sql, Object... params) throws Exception;

	//insert  query
	Object executeUpdate(String sql, Object[] params, String idQuery, Object[] id) throws Exception;

	void close();

	public static class Factory {
		public static ISqlHelper getInstance() {
			return new MySqlHelper();
		}
	}
}
