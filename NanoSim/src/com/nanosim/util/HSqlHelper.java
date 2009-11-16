package com.nanosim.util;

public class HSqlHelper extends SqlHelperBase implements ISqlHelper {

	public HSqlHelper() {

		this.DRIVER_CLASS = "org.hsqldb.jdbcDriver";
		this.URL = "jdbc:hsqldb:file:hsqldb";
		this.USERNAME = "sa";
		this.PASSWORD = "";
	}
}