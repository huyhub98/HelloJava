package com.webblog.controller.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webblog.dao.CateDao;
import com.webblog.dao.PostDao;
import com.webblog.dao.VoteDao;
import com.webblog.entity.VoteEntity;
import com.webblog.model.Vote;
import com.webblog.service.CateService;
import com.webblog.service.PostService;
import com.webblog.service.VoteService;

@Controller
public class Detail {
	
	@Autowired
	PostService postDao;
	@Autowired
	CateService cateDao;
	@Autowired
	VoteService voteDao;
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String DetailPage(HttpServletRequest request,@RequestParam (name = "id",required = false) int id) {
		request.setAttribute("n", postDao.getPostId(id));
		request.setAttribute("categories", cateDao.search(""));
		request.setAttribute("vote", voteDao.search(id));
		request.setAttribute("votes", voteDao.vote());
		
		return "client/detail";
	}
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String DetailPage(HttpServletRequest request,@ModelAttribute("vote") Vote vote) {
		
		Vote vote2 = voteDao.search(vote.getId());		
		if(vote2 != null) {
			vote2.setId(vote.getId());
			vote2.setVote(vote2.getVote()+vote.getVote());
			voteDao.upvote(vote2);
		}else {
			vote2 = new Vote();
			vote2.setId(vote.getId());
			vote2.setVote(vote.getVote());
			vote2.setPost(postDao.getPostId(vote.getId()));
			voteDao.add(vote2);
		}
		
		return "redirect:/post?id="+vote.getId();
	}
}
