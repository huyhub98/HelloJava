package com.webblog.service;

import java.util.List;

import com.webblog.model.Category;

public interface CateService {
	void add(Category category);

	void xoa(int id);

	List<Category> search(String name);

	void sua(Category category);

	Category getId(int id);

	Category getByName(String name);
}
