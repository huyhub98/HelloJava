package com.trungtamjava.master.hellospring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/dang-nhap")
	public String hello(HttpServletRequest req) {
		return "dang-nhap";
	}
	
	@GetMapping("/access-deny")
	public String accessDeny(HttpServletRequest req) {
		return "access-deny";
	}
}
