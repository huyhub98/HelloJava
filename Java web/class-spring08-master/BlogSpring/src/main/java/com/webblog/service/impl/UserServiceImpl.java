package com.webblog.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webblog.dao.PostDao;
import com.webblog.dao.UserDao;
import com.webblog.entity.UserEntity;
import com.webblog.model.User;
import com.webblog.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	public void sua(User user) {
		UserEntity userEntity  = userDao.getId(user.getId());
		if(userEntity !=null) {
			userEntity.setId(user.getId());
			userEntity.setFullname(user.getFullname());
			userEntity.setAddress(user.getAddress());
			userEntity.setImage(user.getImage());
			userEntity.setInfomation(user.getInfomation());
			userEntity.setPassword(user.getPassword());
			userEntity.setUsername(user.getUsername());
			userEntity.setPhone(user.getPhone());
			
			//BeanUtils.copyProperties(user, userEntity, "password","user");
			userDao.sua(userEntity);
		}
		
	}

	public User getId(int id) {
		UserEntity userEntity = userDao.getId(id);
		User user = new User();
		user.setId(userEntity.getId());
		user.setFullname(userEntity.getFullname());
		user.setAddress(userEntity.getAddress());
		user.setImage(userEntity.getImage());
		user.setInfomation(userEntity.getInfomation());
		user.setPassword(userEntity.getPassword());
		user.setUsername(userEntity.getUsername());
		user.setPhone(userEntity.getPhone());
		return user;
	}

	public void add(User user) {
		UserEntity userEntity = new UserEntity();
		
		userEntity.setId(user.getId());
		userEntity.setFullname(user.getFullname());
		userEntity.setAddress(user.getAddress());
		userEntity.setImage(user.getImage());
		userEntity.setInfomation(user.getInfomation());
		userEntity.setPassword(user.getPassword());
		userEntity.setUsername(user.getUsername());
		userEntity.setPhone(user.getPhone());
		
		userDao.add(userEntity);
		
	}

	public void xoa(int id) {
		UserEntity userEntity = userDao.getId(id);
		if(userEntity !=null) {
			userDao.xoa(id);
		}
		
	}

	public User getByUsername(String username) {
		UserEntity userEntity = userDao.getByUsername(username);
		User user = new User();
		user.setId(userEntity.getId());
		user.setFullname(userEntity.getFullname());
		user.setAddress(userEntity.getAddress());
		user.setImage(userEntity.getImage());
		user.setInfomation(userEntity.getInfomation());
		user.setPassword(userEntity.getPassword());
		user.setUsername(userEntity.getUsername());
		user.setPhone(userEntity.getPhone());
		return user;
	}
		
}
