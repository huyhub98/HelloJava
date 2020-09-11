package com.webblog.controller.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webblog.dao.UserDao;
import com.webblog.service.UserService;

@Controller
public class About {

	@Autowired
	UserService userdao;
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String AboutPage(HttpServletRequest request ) {
		
		request.setAttribute("user", userdao.getId(1));
		return "client/about";
	}
}
