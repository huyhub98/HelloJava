package com.webblog.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webblog.dao.CateDao;
import com.webblog.dao.PostDao;
import com.webblog.dao.UserDao;
import com.webblog.entity.CategoryEntity;
import com.webblog.entity.PostEntity;
import com.webblog.entity.UserEntity;
import com.webblog.model.Category;
import com.webblog.model.Post;
import com.webblog.model.User;
import com.webblog.service.PostService;
@Service
@Transactional
public class PostServiceImpl implements PostService {

	@Autowired
	PostDao postDao;
	@Autowired
	UserDao userDao;
	@Autowired
	CateDao cateDao;
	
	public void addPost(Post post) {
		PostEntity postEntity = new PostEntity();
		postEntity.setName(post.getName());
		postEntity.setDescription(post.getDescription());
		postEntity.setImage(post.getImage());
		postEntity.setDate(post.getDate());
		
		UserEntity userEntity = userDao.getId(post.getUser().getId());
		postEntity.setUser(userEntity);
		
		CategoryEntity categoryEntity = cateDao.getId(post.getCategory().getId());
		postEntity.setCategory(categoryEntity);
		
		postDao.addPost(postEntity);
	}

	public void delPost(int id) {
		PostEntity postEntity = postDao.getPostId(id);
		if(postEntity !=null ) {
			postDao.delPost(id);
		}
		
	}

	public void updatePost(Post post) {
		PostEntity postEntity = postDao.getPostId(post.getId());
		if(postEntity != null ) {
			postEntity.setName(post.getName());
			postEntity.setDescription(post.getDescription());
			postEntity.setImage(post.getImage());
			postEntity.setDate(post.getDate());
			
			UserEntity userEntity = userDao.getId(post.getUser().getId());
			postEntity.setUser(userEntity);
			
			CategoryEntity categoryEntity = cateDao.getId(post.getCategory().getId());
			postEntity.setCategory(categoryEntity);
			
			postDao.updatePost(postEntity);
		}
		
	}

	public List<Post> search(String name) {
		List<PostEntity> list = postDao.search(name);
		List<Post> list2 = new ArrayList<Post>();
		for (PostEntity postEntity : list) {
			Post post = new Post();

			post.setId(postEntity.getId());
			post.setName(postEntity.getName());
			post.setDescription(postEntity.getDescription());
			post.setDate(postEntity.getDate());
			post.setImage(postEntity.getImage());
			
			UserEntity userEntity = userDao.getId(postEntity.getUser().getId());
			User user = new User();
			user.setId(userEntity.getId());
			user.setFullname(userEntity.getFullname());
			post.setUser(user);
			
			CategoryEntity categoryEntity = cateDao.getId(postEntity.getCategory().getId());
			Category category = new Category();
			category.setId(categoryEntity.getId());
			category.setName(categoryEntity.getName());
			post.setCategory(category);
			
			list2.add(post);
		}
		return list2;
	}

	public List<Post> search(int categoryid) {
		List<PostEntity> list = postDao.search(categoryid);
		List<Post> list2 = new ArrayList<Post>();
		for (PostEntity postEntity : list) {
			Post post = new Post();

			post.setId(postEntity.getId());
			post.setName(postEntity.getName());
			post.setDescription(postEntity.getDescription());
			post.setDate(postEntity.getDate());
			post.setImage(postEntity.getImage());
			
			UserEntity userEntity = userDao.getId(postEntity.getUser().getId());
			User user = new User();
			user.setId(userEntity.getId());
			user.setFullname(userEntity.getFullname());
			post.setUser(user);
			
			CategoryEntity categoryEntity = cateDao.getId(postEntity.getCategory().getId());
			Category category = new Category();
			category.setId(categoryEntity.getId());
			category.setName(categoryEntity.getName());
			post.setCategory(category);
			
			list2.add(post);
		}
		return list2;
	}

	public Post getPostId(int id) {
		PostEntity postEntity = postDao.getPostId(id);
		Post post = new Post();

		post.setId(id);
		post.setName(postEntity.getName());
		post.setDescription(postEntity.getDescription());
		post.setDate(postEntity.getDate());
		post.setImage(postEntity.getImage());
		
		UserEntity userEntity = userDao.getId(postEntity.getUser().getId());
		User user = new User();
		user.setId(userEntity.getId());
		user.setFullname(userEntity.getFullname());
		post.setUser(user);
		
		CategoryEntity categoryEntity = cateDao.getId(postEntity.getCategory().getId());
		Category category = new Category();
		category.setId(categoryEntity.getId());
		category.setName(categoryEntity.getName());
		post.setCategory(category);
		
		return post;
	}
	

	public Post getPostName(String name) {
		PostEntity postEntity = postDao.getPostName(name);
		Post post = new Post();

		post.setId(postEntity.getId());
		post.setName(postEntity.getName());
		post.setDescription(postEntity.getDescription());
		post.setDate(postEntity.getDate());
		post.setImage(postEntity.getImage());
		
		UserEntity userEntity = userDao.getId(postEntity.getUser().getId());
		User user = new User();
		user.setId(userEntity.getId());
		user.setFullname(userEntity.getFullname());
		post.setUser(user);
		
		CategoryEntity categoryEntity = cateDao.getId(postEntity.getCategory().getId());
		Category category = new Category();
		category.setId(categoryEntity.getId());
		category.setName(categoryEntity.getName());
		post.setCategory(category);
		
		return post;

	}

	public List<Post> limit(int offset) {
		List<PostEntity> listEntity = postDao.limit(offset);
		List<Post> list = new ArrayList<Post>();
		for (PostEntity postEntity : listEntity) {
			Post post = new Post();

			post.setId(postEntity.getId());
			post.setName(postEntity.getName());
			post.setDescription(postEntity.getDescription());
			post.setDate(postEntity.getDate());
			post.setImage(postEntity.getImage());
			
			UserEntity userEntity = userDao.getId(postEntity.getUser().getId());
			User user = new User();
			user.setId(userEntity.getId());
			user.setFullname(userEntity.getFullname());
			post.setUser(user);
			
			CategoryEntity categoryEntity = cateDao.getId(postEntity.getCategory().getId());
			Category category = new Category();
			category.setId(categoryEntity.getId());
			category.setName(categoryEntity.getName());
			post.setCategory(category);
			
			list.add(post);
		}
		return list;
	}

}
