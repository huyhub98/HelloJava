package com.webblog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webblog.dao.CateDao;
import com.webblog.entity.CategoryEntity;
import com.webblog.model.Category;
import com.webblog.service.CateService;

@Service
@Transactional
public class CateServiceImpl implements CateService {

	@Autowired
	CateDao cateDao;
	
	public void add(Category category) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName(category.getName());;
		cateDao.add(categoryEntity);
	}

	public void xoa(int id) {
		cateDao.xoa(id);
		
	}

	public List<Category> search(String name) {
		List<CategoryEntity> entities = cateDao.search(name);
		List<Category> list = new ArrayList<Category>();
		for (CategoryEntity categoryEntity : entities) {
			Category category = new Category();
			category.setId(categoryEntity.getId());
			category.setName(category.getName());
			
			list.add(category);
		}
		return list;
	}

	public void sua(Category category) {
		
		CategoryEntity categoryEntity = cateDao.getId(category.getId());
		
		if( categoryEntity !=null) {
			categoryEntity.setId(category.getId());
			categoryEntity.setName(category.getName());
			
			cateDao.sua(categoryEntity);
		}
		
	}

	public Category getId(int id) {
		CategoryEntity categoryEntity = cateDao.getId(id);
		if(categoryEntity != null ) {
			Category category = new Category();
			category.setId(categoryEntity.getId());
			category.setName(categoryEntity.getName());
			return category;
		}
		return null;
	}

	public Category getByName(String name) {
		CategoryEntity categoryEntity = cateDao.getByName(name);
		if(categoryEntity != null ) {
			Category category = new Category();
			category.setId(categoryEntity.getId());
			category.setName(categoryEntity.getName());
			return category;
		}
		return null;
	}
	
}
