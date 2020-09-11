package com.webblog.controller.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webblog.dao.CateDao;
import com.webblog.dao.PostDao;
import com.webblog.service.CateService;
import com.webblog.service.PostService;

@Controller
public class Categories {
		@Autowired
		PostService postDao;
		@Autowired
		CateService cateDao;
		
		@RequestMapping(value = "/category", method = RequestMethod.GET)
		public String CategoryPage(HttpServletRequest request, @RequestParam(value ="id") int id ) {
			
			request.setAttribute("news", postDao.search(id));
			request.setAttribute("categories", cateDao.search(""));
			
			return "client/search";
		}
}
