package com.volucris.streamkingdom.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
	@GetMapping("/start")
	public String getStart() {
		return "start";
	}
}
