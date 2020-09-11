package com.webblog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webblog.dao.PostDao;
import com.webblog.dao.VoteDao;
import com.webblog.entity.PostEntity;
import com.webblog.entity.VoteEntity;
import com.webblog.model.Post;
import com.webblog.model.Vote;
import com.webblog.service.VoteService;
@Service
@Transactional
public class VoteServiceImpl implements VoteService {
	
	@Autowired
	VoteDao voteDao;
	@Autowired
	PostDao postDao;
	public void add(Vote vote) {
		VoteEntity voteEntity = new VoteEntity();
		voteEntity.setId(vote.getId());
		voteEntity.setVote(vote.getVote());
		
		PostEntity postEntity = postDao.getPostId(vote.getPost().getId());
		voteEntity.setPost(postEntity);
		
		voteDao.add(voteEntity);
	}

	public void upvote(Vote vote) {
		VoteEntity voteEntity = new VoteEntity();
		voteEntity.setId(vote.getId());
		voteEntity.setVote(vote.getVote());
		
		PostEntity postEntity = postDao.getPostId(vote.getPost().getId());
		voteEntity.setPost(postEntity);
		
		voteDao.upvote(voteEntity);
		
	}

	public Vote search(int postid) {
		VoteEntity voteEntity = voteDao.search(postid);
		Vote vote = new Vote();
		vote.setId(voteEntity.getId());
		vote.setVote(voteEntity.getVote());
		
		PostEntity postEntity = postDao.getPostId(postid);
		Post post = new Post();
		post.setId(postid);
		post.setName(postEntity.getName());
		post.setDescription(postEntity.getDescription());
		post.setDate(postEntity.getDate());
		post.setImage(postEntity.getImage());
		vote.setPost(post);
		return vote;
	}

	public List<Vote> vote() {
		List<VoteEntity> voteEntities = voteDao.vote();
		List<Vote> votes = new ArrayList<Vote>();
		for (VoteEntity voteEntity : voteEntities) {
			Vote  vote = new Vote();
			vote.setId(voteEntity.getId());
			vote.setVote(voteEntity.getVote());
			
			PostEntity postEntity = postDao.getPostId(voteEntity.getPost().getId());
			Post post = new Post();
			post.setId(postEntity.getId());
			post.setName(postEntity.getName());
			vote.setPost(post);
			
			votes.add(vote);
		}
		return votes;
	}

}
