package com.nanosim.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlHelperBase implements ISqlHelper {

	protected String DRIVER_CLASS;
	protected String URL;
	protected String USERNAME;
	protected String PASSWORD;

	private Connection conn;
	private PreparedStatement st;

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
	public ResultSet executeQuery(String sql, Object... params)
			throws Exception {
		if (st != null && !st.isClosed())
			st.close();
		if (conn == null || conn.isClosed())
			open();
		st = conn.prepareStatement(sql);
		int i = 0;
		for (Object param : params) {
			st.setObject(i, param);
			i++;
		}
		ResultSet rs = st.executeQuery(); // run the query
		return rs;
	}

	@Override
	public int executeUpdate(String sql, Object... params) throws Exception {
		if (conn == null || !conn.isClosed())
			open();
		st = conn.prepareStatement(sql);
		int i = 0;
		for (Object param : params) {
			st.setObject(i, param);
			i++;
		}
		int retVal = st.executeUpdate(); // run the query
		st.close();
		this.close();
		return retVal;
	}

	@Override
	public Object executeUpdate(String sql, Object[] params, String idQuery,
			Object[] ids) throws Exception {
		if (conn == null || !conn.isClosed())
			open();

		conn.setAutoCommit(false);
		st = conn.prepareStatement(sql);
		int i = 0;
		for (Object param : params) {
			st.setObject(i, param);
			i++;
		}
		st.executeUpdate();
		st = conn.prepareStatement(sql);
		i = 0;
		for (Object id : ids) {
			st.setObject(i, id);
			i++;
		}
		ResultSet rs = st.executeQuery(); // read id
		Object retVal = null;
		if (rs.next()) {
			retVal = rs.getObject(0); //is index correct??
		}
		conn.commit();
		conn.setAutoCommit(true);
		st.close();
		this.close();
		return retVal;
	}
}