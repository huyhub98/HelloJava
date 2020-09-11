package com.webblog.dao;

import java.util.List;

import com.webblog.entity.PostEntity;


public interface PostDao {
	void addPost(PostEntity post);

	void delPost(int id);

	void updatePost(PostEntity post);

	List<PostEntity> search(String name);

	List<PostEntity> search(int categoryid);

	PostEntity getPostId(int id);

	PostEntity getPostName(String name);

	List<PostEntity> limit(int offset);
}
