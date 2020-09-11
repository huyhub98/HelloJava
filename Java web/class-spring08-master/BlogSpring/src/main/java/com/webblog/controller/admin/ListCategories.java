package com.webblog.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webblog.dao.CateDao;
import com.webblog.service.CateService;

@Controller
public class ListCategories {

	@Autowired
	CateService cateDao;
	
	@RequestMapping(value = "/admin/listcate",method = RequestMethod.GET)
	public String ListCatePage(HttpServletRequest request) {
		request.setAttribute("categories", cateDao.search(""));
		return "admin/listcategory";
	}
}
