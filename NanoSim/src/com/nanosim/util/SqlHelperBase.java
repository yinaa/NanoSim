package com.nanosim.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlHelperBase implements ISqlHelper {

	protected String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	protected String URL = "jdbc:mysql://localhost/nanosim";
	protected String USERNAME = "root";
	protected String PASSWORD = "root";

	private Connection conn;
	private Statement st;

	protected void open() throws Exception {
		Class.forName(DRIVER_CLASS);
		conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	public void close() {
		try {
			if (st != null && !st.isClosed())
				st.close();
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			st = null;
			conn = null;
		}

	}

	@Override
	public ResultSet executeQuery(String sql) throws Exception {
		if (st != null && !st.isClosed())
			st.close();
		if (conn == null || conn.isClosed())
			open();
		st = conn.createStatement(); // statements
		ResultSet rs = st.executeQuery(sql); // run the query
		return rs;
	}

	@Override
	public int executeUpdate(String sql) throws Exception {
		if (conn == null || !conn.isClosed())
			open();
		Statement st = conn.createStatement(); // statements
		int retVal = st.executeUpdate(sql); // run the query
		st.close();
		this.close();
		return retVal;
	}
}