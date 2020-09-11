package com.webblog.controller.admin;

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
public class Delete {

	@Autowired
	CateService cateDao;
	@Autowired
	PostService postDao;
	
	@RequestMapping(value = "/admin/delpost",method = RequestMethod.GET)
	public String DeletePost(@RequestParam(value ="id") int id) {
		postDao.delPost(id);
		return"redirect:admin/index";
	}
	@RequestMapping(value = "/admin/delcate",method = RequestMethod.GET)
	public String DeleteCate(@RequestParam(value ="id") int id) {
		cateDao.xoa(id);
		return"redirect:admin/listcategory";
	}
}
