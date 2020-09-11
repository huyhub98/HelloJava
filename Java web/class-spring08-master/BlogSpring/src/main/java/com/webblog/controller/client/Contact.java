package com.webblog.controller.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webblog.dao.UserDao;
import com.webblog.service.UserService;

@Controller
public class Contact {

	@Autowired
	UserService userDao;

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String ContactPage(HttpServletRequest request, @RequestParam(name = "msg", required = false) String msg) {

		if (msg != null && msg.equals("100")) {
			request.setAttribute("msg", "MESSAGE SEND SUCCESSFULLY");
		}
		request.setAttribute("user", userDao.getId(1));
		return "client/contact";
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String ContactPage(HttpServletRequest request, @RequestParam(value = "name") String name
														, @RequestParam(value="email") String email
														,@RequestParam(value = "subject") String subject
														,@RequestParam(value = "message") String message) {
		
		request.setAttribute("user", userDao.getId(1));
		
		return "redirect:/client/contact?msg=100";
	}
}
