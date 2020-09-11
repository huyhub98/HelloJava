package com.webblog.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webblog.dao.CateDao;
import com.webblog.entity.CategoryEntity;

@Repository
@Transactional
public class CateDaoImpl implements CateDao {

	@Autowired
	SessionFactory sessionFactory;

	public void add(CategoryEntity category) {
		sessionFactory.getCurrentSession().save(category);
	}

	public void xoa(int id) {
		sessionFactory.getCurrentSession().delete(getId(id));

	}

	public List<CategoryEntity> search(String name) {
		String hql = "SELECT c FROM CategoryEntity c WHERE c.name Like :name";
		return sessionFactory.getCurrentSession().createQuery(hql).setParameter("name", "%" + name + "%").list();
	}

	public void sua(CategoryEntity category) {
		sessionFactory.getCurrentSession().merge(category);
	}

	public CategoryEntity getId(int id) {
		return (CategoryEntity) sessionFactory.getCurrentSession().get(CategoryEntity.class, id);
	}
	public CategoryEntity getByName(String name) {
		String hql = "SELECT c FROM CategoryEntity c WHERE c.name = :name";
		return (CategoryEntity) sessionFactory.getCurrentSession().createQuery(hql).setParameter("name", name ).uniqueResult();
	}
}
