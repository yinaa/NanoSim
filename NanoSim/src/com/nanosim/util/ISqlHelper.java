package com.nanosim.util;

import java.sql.ResultSet;

public interface ISqlHelper {

	ResultSet executeQuery(String sql) throws Exception;

	int executeUpdate(String sql) throws Exception;

	void close();

	public static class Factory {
		public static ISqlHelper getInstance() {
			return new MySqlHelper();
		}
	}
}
