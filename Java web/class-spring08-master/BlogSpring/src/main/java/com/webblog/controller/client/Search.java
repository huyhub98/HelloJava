package com.webblog.controller.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webblog.dao.PostDao;
import com.webblog.service.PostService;

@Controller
public class Search {
	@Autowired
	PostService postDao;
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String SearchPage(HttpServletRequest request, @RequestParam(value = "keyword") String keyword) {
		
		request.setAttribute("news", postDao.search(keyword));
		
		return "client/search";
	}
}
