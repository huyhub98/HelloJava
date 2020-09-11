package com.webblog.service;

import com.webblog.model.User;

public interface UserService {
	public void sua(User user);

	public User getId(int id);

	public void add(User user);

	public void xoa(int id);

	public User getByUsername(String username);
}
