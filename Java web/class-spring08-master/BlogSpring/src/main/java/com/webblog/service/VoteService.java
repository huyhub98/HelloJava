package com.webblog.service;

import java.util.List;

import com.webblog.model.Vote;

public interface VoteService {
	void add(Vote vote);
	
	void upvote(Vote vote);
	
	Vote search(int postid);
	
	List<Vote> vote();
}
