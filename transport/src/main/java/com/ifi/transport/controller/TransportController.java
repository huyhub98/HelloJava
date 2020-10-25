package com.ifi.transport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TransportController {

	@GetMapping(value = "/display")
	public String show() {
		return "/display";
	}

	@PostMapping(value = "/display")
	public String display() {
		return "";
	}
}
