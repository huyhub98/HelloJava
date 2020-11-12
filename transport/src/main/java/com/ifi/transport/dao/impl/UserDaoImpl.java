package com.ifi.transport.dao.impl;

import com.ifi.transport.dao.UserDao;
import com.ifi.transport.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(id);
    }

    @Override
    public User getId(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> search(String name) {
        String jql = "SELECT u FROM User u WHERE u.username = :username";
        Query query = entityManager.createQuery(jql, User.class);
        query.setParameter("username", "%" + name + "%");
        return query.getResultList();
    }

    @Override
    public List<User> getList() {
        String jql = "SELECT u FROM User u";
        Query query = entityManager.createQuery(jql, User.class);
        return query.getResultList();
    }
}
