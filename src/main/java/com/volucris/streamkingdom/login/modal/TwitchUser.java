package com.volucris.streamkingdom.login.modal;

import com.fasterxml.jackson.annotation.JsonAlias;

public class TwitchUser {

	@JsonAlias("broadcaster_type")
	private String broadcasterType;

	@JsonAlias("display_name")
	private String displayName;

	@JsonAlias("id")
	private String id;

	@JsonAlias("login")
	private String login;

	@JsonAlias("profile_image_url")
	private String profileImageUrl;

	public String getBroadcasterType() {
		return this.broadcasterType;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public String getId() {
		return this.id;
	}

	public String getLogin() {
		return this.login;
	}

	public String getProfileImageUrl() {
		return this.profileImageUrl;
	}

	public void setBroadcasterType(final String broadcasterType) {
		this.broadcasterType = broadcasterType;
	}

	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public void setLogin(final String login) {
		this.login = login;
	}

	public void setProfileImageUrl(final String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

}
