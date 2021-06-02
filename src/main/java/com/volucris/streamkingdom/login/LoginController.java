package com.volucris.streamkingdom.login;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.volucris.streamkingdom.config.Secret;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/")
	public String getLoginUser(@RequestParam String code) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
		String uri = "https://id.twitch.tv/oauth2/token?client_id=vqjecsdv2qjlssrzrvj4n9etmovy0l&client_secret="+ Secret.SECRET.getSecret() +"&code="+ code +"&grant_type=authorization_code&redirect_uri=http://localhost:8080/";
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<TwitchResponse> responseEntityStr = restTemplate.postForEntity(uri, request, TwitchResponse.class);
		System.out.println(responseEntityStr.getBody().getAccessToken());
		headers.add("Authorization", "Bearer " + responseEntityStr.getBody().getAccessToken());
		headers.add("Client-Id", "vqjecsdv2qjlssrzrvj4n9etmovy0l");
		HttpEntity<String> getRequest = new HttpEntity<String>(headers);
		ResponseEntity<String> userResponse =  restTemplate.exchange("https://api.twitch.tv/helix/users", HttpMethod.GET, getRequest, String.class);
		System.out.println(userResponse.getBody());
		return "index";
	}
}
