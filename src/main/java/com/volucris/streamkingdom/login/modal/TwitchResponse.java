package com.volucris.streamkingdom.login.modal;

import com.fasterxml.jackson.annotation.JsonAlias;

public class TwitchResponse {

	@JsonAlias("access_token")
	private String accessToken;

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(final String accessToken) {
		this.accessToken = accessToken;
	}

}
