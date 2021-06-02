package com.volucris.streamkingdom.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	@GetMapping("/")
	public String getLoginUser(@RequestParam final String code) {
		final String accessToken = this.loginService.getAccessToken(code);
		System.out.println(this.loginService.getTwitchResponse(accessToken));
		return "index";
	}

}
