package com.webblog.dao;

import java.util.List;

import com.webblog.entity.CategoryEntity;

public interface CateDao {
	void add(CategoryEntity category);

	void xoa(int id);

	List<CategoryEntity> search(String name);

	void sua(CategoryEntity category);

	CategoryEntity getId(int id);

	CategoryEntity getByName(String name);

}
