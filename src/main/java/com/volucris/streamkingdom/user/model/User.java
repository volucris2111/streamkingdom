package com.volucris.streamkingdom.user.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {

	private String broadcasterType;

	private String displayName;

	@Id
	private ObjectId id;

	private String login;

	private String profileImageUrl;

	private String twitchId;

	public String getBroadcasterType() {
		return this.broadcasterType;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public ObjectId getId() {
		return this.id;
	}

	public String getLogin() {
		return this.login;
	}

	public String getProfileImageUrl() {
		return this.profileImageUrl;
	}

	public String getTwitchId() {
		return this.twitchId;
	}

	public void setBroadcasterType(final String broadcasterType) {
		this.broadcasterType = broadcasterType;
	}

	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	public void setId(final ObjectId id) {
		this.id = id;
	}

	public void setLogin(final String login) {
		this.login = login;
	}

	public void setProfileImageUrl(final String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public void setTwitchId(final String twitchId) {
		this.twitchId = twitchId;
	}
}
