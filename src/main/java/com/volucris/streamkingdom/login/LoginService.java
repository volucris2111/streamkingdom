package com.volucris.streamkingdom.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.volucris.streamkingdom.config.Secret;
import com.volucris.streamkingdom.login.modal.TwitchResponse;
import com.volucris.streamkingdom.login.modal.TwitchUsersResponse;
import com.volucris.streamkingdom.login.repository.LoginDataAccess;

@Service
public class LoginService {

	private static String CLIEND_ID = "vqjecsdv2qjlssrzrvj4n9etmovy0l";

	private static String REDIRECT_URI = "http://localhost:8080/";

	private static String TWITCH_OAUTH2_URI = "https://id.twitch.tv/oauth2/token?client_id=%s&client_secret=%s&code=%s&grant_type=authorization_code&redirect_uri=%s";

	@Autowired
	private LoginDataAccess loginDataAccess;

	public String getAccessToken(final String code) {
		final RestTemplate restTemplate = new RestTemplate();
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		final String uri = String.format(LoginService.TWITCH_OAUTH2_URI, LoginService.CLIEND_ID,
				Secret.SECRET.getSecret(), code, LoginService.REDIRECT_URI);
		final HttpEntity<String> request = new HttpEntity<String>(headers);
		final ResponseEntity<TwitchResponse> responseEntityStr = restTemplate.postForEntity(uri, request,
				TwitchResponse.class);
		return responseEntityStr.getBody().getAccessToken();
	}

	public ResponseEntity<TwitchUsersResponse> getTwitchResponse(final String accessToken) {
		final RestTemplate restTemplate = new RestTemplate();
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Bearer " + accessToken);
		headers.add("Client-Id", LoginService.CLIEND_ID);
		final HttpEntity<String> getRequest = new HttpEntity<String>(headers);
		final ResponseEntity<TwitchUsersResponse> userResponse = restTemplate
				.exchange("https://api.twitch.tv/helix/users", HttpMethod.GET, getRequest, TwitchUsersResponse.class);
		this.loginDataAccess.save(userResponse.getBody().getTwitchUsers().get(0));
		return userResponse;
	}
}
