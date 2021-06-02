package com.volucris.streamkingdom.login.modals;

import com.fasterxml.jackson.annotation.JsonAlias;

public class TwitchResponse {
	
	@JsonAlias("access_token")
	private String accessToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
}
