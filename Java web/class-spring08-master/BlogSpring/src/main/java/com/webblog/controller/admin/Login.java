package com.webblog.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webblog.dao.UserDao;
import com.webblog.entity.UserEntity;
import com.webblog.model.User;
import com.webblog.service.UserService;

@Controller
public class Login {
		@Autowired
		UserService userDao;
		
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String LoginPage(HttpServletRequest request, @RequestParam(value = "err",required = false) String err) {
			if(err !=null && err.equals("100")) {
				request.setAttribute("msg", "Tài khoản hoặc mật khẩu sai");
			}
			return "admin/login";
		}
		@RequestMapping( value ="/login",method = RequestMethod.POST)
		public String LoginPage(HttpServletRequest request, @ModelAttribute User user) {
			request.setAttribute("user", user);
			User user2 = userDao.getByUsername(user.getUsername());
			if(user2 !=null && user2.getPassword().equals(user.getPassword())) {
				return "admin/index";
			}
			return "redirect:/login?err=100";
		}
		
}
