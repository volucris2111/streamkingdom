package com.volucris.streamkingdom.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/user/test")
	public String getUserTest() {

		return "user/test";
	}
}
