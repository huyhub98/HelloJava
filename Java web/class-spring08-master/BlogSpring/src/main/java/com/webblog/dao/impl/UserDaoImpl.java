package com.webblog.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webblog.dao.UserDao;
import com.webblog.entity.UserEntity;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	public void sua(UserEntity user) {
		sessionFactory.getCurrentSession().update(user);
	}

	public UserEntity getId(int id) {
		return (UserEntity) sessionFactory.getCurrentSession().get(UserEntity.class, id);
	}

	public void add(UserEntity user) {
		sessionFactory.getCurrentSession().save(user);

	}

	public void xoa(int id) {
		sessionFactory.getCurrentSession().delete(getId(id));

	}

	public UserEntity getByUsername(String username) {
		String hql = "FROM PostEntity WHERE name = :name ";
		return (UserEntity) sessionFactory.getCurrentSession().createQuery(hql).setParameter("name", username).uniqueResult();
	}


}
