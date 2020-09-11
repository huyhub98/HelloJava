package com.webblog.dao;

import com.webblog.entity.UserEntity;

public interface UserDao {
	void sua(UserEntity user);

	UserEntity getId(int id);

	void add(UserEntity user);

	void xoa(int id);

	UserEntity getByUsername(String username);
}
