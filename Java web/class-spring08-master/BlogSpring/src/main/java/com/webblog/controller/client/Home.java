package com.webblog.controller.client;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webblog.controller.admin.ExceptionController;
import com.webblog.dao.CateDao;
import com.webblog.dao.PostDao;
import com.webblog.dao.VoteDao;
import com.webblog.model.Category;
import com.webblog.model.Post;
import com.webblog.model.Vote;
import com.webblog.service.CateService;
import com.webblog.service.PostService;
import com.webblog.service.VoteService;

@Controller
public class Home {
	
	//private static Logger logger = Logger.getLogger(Home.class);
	
	@Autowired
	PostService postdao;
	@Autowired
	CateService catedao;
	@Autowired
	VoteService votedao;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String HomePage(HttpServletRequest request,@RequestParam (name = "offset", required = false) String offset  ) {
		
		//logger.info("bai dang");
//		int i;
//		if(offset == null) {
//			i=0;
//		}else {
//			i=Integer.parseInt(offset);
//		}
//		
////		List<Post> posts1 = postdao.limit(i);
//		request.setAttribute("news1", postdao.limit(i));
//	
////		List<Post> posts = postdao.search("");
//		request.setAttribute("news2", postdao.search(""));
//		
//		//List<Category> categories = catedao.search("");
//		request.setAttribute("categories", catedao.search(""));
//		
////		List<Vote> votes = votedao.vote();
//		request.setAttribute("votes", votedao.vote());
		return "/client/home.jsp";	
	}
}
