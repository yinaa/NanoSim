package org.nanosim.server;

import org.nanosim.client.GreetingService;
import org.nanosim.dao.PMFactory;
import org.nanosim.dto.Greeting;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.util.Date;
import javax.jdo.PersistenceManager;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import java.util.logging.Logger;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {
	private static final Logger log = Logger
			.getLogger(GreetingServiceImpl.class.getName());

	public String greetServer(String input) {

		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();

		Date date = new Date();
		Greeting greeting = new Greeting(user, input, date);

		PersistenceManager pm = PMFactory.get().getPersistenceManager();
		try {
			pm.makePersistent(greeting);
		} finally {
			pm.close();
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");
		return "Hello, " + input + "!<br><br>I am running " + serverInfo
				+ ".<br><br>It looks like you are using:<br>" + userAgent;
	}
}
