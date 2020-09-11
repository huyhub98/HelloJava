package com.webblog.service;

import java.util.List;

import com.webblog.model.Post;

public interface PostService {
	void addPost(Post post);

	void delPost(int id);

	void updatePost(Post post);

	List<Post> search(String name);

	List<Post> search(int categoryid);

	Post getPostId(int id);

	Post getPostName(String name);

	List<Post> limit(int offset);
}
