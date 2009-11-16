package com.nanosim.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Cookies;

public class CookieHelper {
	public static class Util {
		private static CookieHelper instance;

		public static CookieHelper getInstance() {
			if (instance == null) {
				instance = GWT.create(CookieHelper.class);
			}
			return instance;
		}
	}

	private final String LOGGED_IN = "LOGGED_IN";
	private final String USER_ID = "USER_ID";

	private boolean matchValue(String key, String value) {
		final String val = Cookies.getCookie(key);
		return val != null && val == value;
	}

	private long getLongValue(String key) {
		final String val = Cookies.getCookie(key);
		try {
			return val != null ? Long.parseLong(val) : -1;
		} catch (NumberFormatException ex) {
			return -1;
		}
	}

	public boolean getIsLoggedIn() {
		return matchValue(LOGGED_IN, "1");
	}

	public void setIsLoggedIn(boolean loggedIn) {
		Cookies.setCookie(LOGGED_IN, loggedIn ? "1" : "0");
	}

	public long getUserId() {
		return getLongValue(USER_ID);
	}

	public void setUserId(long id) {
		Cookies.setCookie(USER_ID, "" + id);
	}
}
