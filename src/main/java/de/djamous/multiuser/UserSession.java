package de.djamous.multiuser;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserSession {
	private UUID uuid;
	private String name;
	private List<SessionUser> sessionUsers;

	public UserSession(String name) {
		this.uuid = UUID.randomUUID();
		this.name = name;
		this.sessionUsers = new ArrayList<>();
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getName() {
		return name;
	}

	public List<SessionUser> getSessionUsers() {
		return sessionUsers;
	}

	public void setSessionUsers(List<SessionUser> sessionUsers) {
		this.sessionUsers = sessionUsers;
	}

	public void setSessionUser(String name) {
		this.sessionUsers.add(new SessionUser(name));
	}
}
