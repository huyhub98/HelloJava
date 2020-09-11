package com.trungtamjava.springbootdemo.dao;

import java.util.List;

import com.trungtamjava.springbootdemo.entity.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(int id);
	
	User get(int id);// duy nhat

	User getByUsername(String username);// duy nhat

	List<User> search(String name);
}
