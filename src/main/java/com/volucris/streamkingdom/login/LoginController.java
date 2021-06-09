package com.volucris.streamkingdom.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/login")
	public ModelAndView getLoginUser(@RequestParam(required = false) final String code,
			final HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("login");
		if (code != null) {
			this.loginService.login(request,
					this.loginService.getTwitchResponse(this.loginService.getAccessToken(code)));
		}
		if (request.getSession(false) != null) {
			modelAndView = new ModelAndView("redirect:/");
		}
		return modelAndView;
	}
}
