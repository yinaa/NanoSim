package com.nanosim.server;

import com.nanosim.client.rpc.LoginService;
import com.nanosim.dao.PersonDAO;
import com.nanosim.model.Person;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	private static final long serialVersionUID = 4809883712768767861L;

	@Override
	public Person signin(String userName, String password) {
		try {
			PersonDAO personDao = new PersonDAO();
			return personDao.signin(userName, password);
		} catch (Exception e) {
			return null;
		}
	}
}
