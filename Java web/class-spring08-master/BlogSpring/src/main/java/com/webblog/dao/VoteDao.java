package com.webblog.dao;

import java.util.List;

import com.webblog.entity.VoteEntity;
import com.webblog.model.Vote;



public interface VoteDao {
	
	void add(VoteEntity vote);
	
	void upvote(VoteEntity vote);
	
	VoteEntity search(int postid);
	
	List<VoteEntity> vote();
}	
