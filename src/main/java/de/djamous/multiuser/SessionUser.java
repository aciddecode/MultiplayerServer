package de.djamous.multiuser;

import java.util.UUID;

public class SessionUser {
	private UUID uuid;
	private String userName;

	public SessionUser(String userName) {
		this.uuid = UUID.randomUUID();
		this.userName = userName;
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
