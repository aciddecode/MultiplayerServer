package de.djamous.multiuser;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class ServerSession {
	private List<UserSession> userSessions;

	public ServerSession() {
		this.userSessions = new ArrayList<>();
	}

	public List<UserSession> getUserSessions() {
		return userSessions;
	}

	public void addUserSession(UserSession userSession) {
		userSessions.add(userSession);
	}

	public UserSession getUserSession(UUID uuid) {
		UserSession value = null;
		for (UserSession userSession : userSessions) {
			if (userSession.getUuid().compareTo(uuid) == 0) {
				value = userSession;
			}
		}
		return value;
	}

	public void addUserSessionUser(UUID uuid, String name) {
		boolean found = false;
		for(SessionUser users : getUserSession(uuid).getSessionUsers()) {
			if(users.getUserName().equals(name)) {
				found = true;
			}
		}
		
		if (!found) {
			getUserSession(uuid).setSessionUser(name);
		}
		
	}

}
