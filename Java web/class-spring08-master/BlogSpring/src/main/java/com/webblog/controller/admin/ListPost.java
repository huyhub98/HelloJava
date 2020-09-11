package com.webblog.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webblog.dao.CateDao;
import com.webblog.dao.PostDao;
import com.webblog.service.CateService;
import com.webblog.service.PostService;

@Controller
public class ListPost {
	@Autowired
	PostService postDao;
	@Autowired
	CateService cateDao;
	
	@RequestMapping(value = "/admin/index",method = RequestMethod.GET)
	public String IndexPage(HttpServletRequest request) {
		request.setAttribute("news", postDao.search(""));
		request.setAttribute("categories", cateDao.search(""));
		return "admin/index";
	}
}
