package com.webblog.controller.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.webblog.dao.CateDao;
import com.webblog.dao.PostDao;
import com.webblog.dao.UserDao;
import com.webblog.entity.PostEntity;
import com.webblog.model.Post;
import com.webblog.service.CateService;
import com.webblog.service.PostService;
import com.webblog.service.UserService;

@Controller
public class CreatPost {

	@Autowired
	CateService cateDao;
	@Autowired
	UserService userDao;
	@Autowired
	PostService postDao;
	
	@RequestMapping(value = "/admin/addpost",method = RequestMethod.GET)
	public String CreatPostPage(HttpServletRequest request,@RequestParam(value = "err") int err) {
		
		request.setAttribute("categories", cateDao.search(""));
		request.setAttribute("user", userDao.getId(1));
		
		if(err==100) {
			request.setAttribute("msg", "Tiêu đề bị trùng");
		}
		return"admin/creatpost";
	}
	
	@RequestMapping(value = "/admin/addpost",method = RequestMethod.POST)
	public String CreatPostPage(HttpServletRequest request,@ModelAttribute Post post) {
		if(postDao.getPostName(post.getName()) != null) {
			return "redirect:admin/addpost?err=100";
		}
		MultipartFile file = post.getMultipartFile();
		File newfile = new File("D:\\GitHub-Project\\WebBlogSpringMVC\\image\\"+file.getOriginalFilename());
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(newfile);
			fileOutputStream.write(file.getBytes());
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return"redirect:admin/index";
	}
	
}
