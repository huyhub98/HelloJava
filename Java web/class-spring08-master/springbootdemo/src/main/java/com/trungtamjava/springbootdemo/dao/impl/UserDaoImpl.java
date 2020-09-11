package com.trungtamjava.springbootdemo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.trungtamjava.springbootdemo.dao.UserDao;
import com.trungtamjava.springbootdemo.entity.User;

//tao 1 bean UserdaoImpl
@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void add(User user) {
		entityManager.persist(user);
	}

	@Override
	public void update(User user) {
		entityManager.merge(user);
	}

	@Override
	public void delete(int id) {
		entityManager.remove(get(id));
	}

	@Override
	public User get(int id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public List<User> search(String name) {
		String sql = "SELECT u FROM User u WHERE u.name LIKE :name";
		return entityManager.createQuery(sql).setParameter("name", "%" + name + "%").getResultList();
	}

	@Override
	public User getByUsername(String username) {
		String sql = "SELECT u FROM User u WHERE u.username = :uname";
		return (User) entityManager.createQuery(sql).setParameter("uname", username).getSingleResult();
	}

}
