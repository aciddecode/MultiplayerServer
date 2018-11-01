package de.djamous.multiuser;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session-management")
public class SessionController {

	@Autowired
	private ServerSession serverSession;

	@RequestMapping(method = RequestMethod.GET, value = "/sessions")
	public ServerSession getSessions() {
		return serverSession;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/sessions")
	public UUID setSession(@RequestParam(value = "name", defaultValue = "World") String name) {
		UserSession userSession = new UserSession(name);
		serverSession.addUserSession(userSession);
		return userSession.getUuid();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/sessions/users")
	public void setUser(@RequestParam(value = "sessionId") UUID uuid,
			@RequestParam(value = "name", defaultValue = "User") String name) {
		UserSession userSession = serverSession.getUserSession(uuid);
		serverSession.addUserSessionUser(uuid, name);
	}

}
