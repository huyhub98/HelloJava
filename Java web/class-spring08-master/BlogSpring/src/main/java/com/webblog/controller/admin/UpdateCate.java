package com.webblog.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webblog.dao.CateDao;
import com.webblog.entity.CategoryEntity;
import com.webblog.model.Category;
import com.webblog.service.CateService;

@Controller
public class UpdateCate {
	
	@Autowired
	CateService cateDao;
	
	@RequestMapping(value = "/admin/upcate", method = RequestMethod.GET)
	public String UpdateCatePage(HttpServletRequest request,@RequestParam(value = "id") int id) {
		request.setAttribute("category", cateDao.getId(id));
		
		return "admin/upcate";
	}
	@RequestMapping(value = "/admin/upcate", method = RequestMethod.POST)
	public String UpdateCatePage(HttpServletRequest request,@ModelAttribute Category category) {
		cateDao.sua(category);
		return "redirect:admin/listcategory";
	}
}
