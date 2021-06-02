package com.volucris.streamkingdom.login.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

public class TwitchUsersResponse {

	@JsonAlias("data")
	private List<TwitchUser> twitchUsers;

	public List<TwitchUser> getTwitchUsers() {
		return this.twitchUsers;
	}

	public void setTwitchUsers(final List<TwitchUser> twitchUsers) {
		this.twitchUsers = twitchUsers;
	}
}
