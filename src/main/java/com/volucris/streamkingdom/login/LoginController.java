package com.volucris.streamkingdom.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.volucris.streamkingdom.login.modal.TwitchUser;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	@GetMapping("/")
	public ModelAndView getLoginUser(@RequestParam final String code, final HttpServletRequest request) {
		final ModelAndView modelAndView = new ModelAndView("index");
		final TwitchUser user = this.loginService.getTwitchResponse(this.loginService.getAccessToken(code)).getBody()
				.getTwitchUsers().get(0);
		this.loginService.login(request, user.getId());
		modelAndView.addObject("user", user);
		return modelAndView;
	}

}
