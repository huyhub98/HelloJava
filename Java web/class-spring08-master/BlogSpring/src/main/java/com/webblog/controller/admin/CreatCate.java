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
public class CreatCate {

	@Autowired
	CateService catedao;

	@RequestMapping(value = "/admin/addcate", method = RequestMethod.GET)
	public String CreatCatePage(HttpServletRequest request, @RequestParam(value = "err", required = false) int err) {

		if (err == 100) {
			request.setAttribute("msg", "tên tiêu đề bị trùng");
		}
		return "admin/creatcate";
	}

	@RequestMapping(value = "/admin/addcate", method = RequestMethod.POST)
	public String CreatCatePage(HttpServletRequest request, @ModelAttribute Category category) {

		if (catedao.getByName(category.getName()) != null) {
			return "redirect:/admin/addcate?err=100";
		} else {
			catedao.add(category);;
			return "redirect:admin/category";
		}
	}

}
