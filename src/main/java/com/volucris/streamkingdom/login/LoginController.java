package com.volucris.streamkingdom.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	@GetMapping("/")
	public ModelAndView getLoginUser(@RequestParam final String code) {
		final ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("user", this.loginService.getTwitchResponse(this.loginService.getAccessToken(code))
				.getBody().getTwitchUsers().get(0));
		return modelAndView;
	}

}
