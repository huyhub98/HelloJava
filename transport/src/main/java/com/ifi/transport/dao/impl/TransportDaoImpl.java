package com.ifi.transport.dao.impl;

import com.ifi.transport.dao.TransportDao;
import com.ifi.transport.entity.Transport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class TransportDaoImpl implements TransportDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(Transport trans) {
        try {
            entityManager.persist(trans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Transport trans) {
        try {
            entityManager.merge(trans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            entityManager.remove(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
