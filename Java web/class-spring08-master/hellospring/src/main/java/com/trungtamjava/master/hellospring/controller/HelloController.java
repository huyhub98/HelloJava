package com.trungtamjava.master.hellospring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(HttpServletRequest req) {
		String s = "hello java spring boot";
		req.setAttribute("hello", s);
		return "hello";
	}
	
	@GetMapping("/hi")
	public String hi(Model model) {
		model.addAttribute("hi","HELLLO SPRING BOOT!");
		return "hi";
	}
	

//	@Value("${my.key}")
//	private String hello;

//	@Autowired
//	private Environment env;
//
//	@GetMapping(value = "/hello")
//	public String hello(HttpServletRequest request, Model model) {
//		System.out.println(hello);
//		System.out.println(env.getProperty("my.key"));
//		
//		String s = "Hello Java. Hoc cung thay giao";
//		
//		request.setAttribute("hello", s);
//		
//		String hi = "hi java online. learn.trungtamjava.com";
//		
//		model.addAttribute("hi", hi);
//		
//		return "hello";
//	}
}
