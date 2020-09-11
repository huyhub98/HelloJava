package com.webblog.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webblog.dao.VoteDao;
import com.webblog.entity.VoteEntity;

@Repository
@Transactional
public class VoteDaoImpl implements VoteDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void add(VoteEntity vote) {
		sessionFactory.getCurrentSession().save(vote);
	}

	public void upvote(VoteEntity vote) {
		sessionFactory.getCurrentSession().update(vote);
	}

	public VoteEntity search(int postid) {
		return (VoteEntity) sessionFactory.getCurrentSession().get(VoteEntity.class, postid);
	}

	public List<VoteEntity> vote() {
		String sql = "SELECT v FROM VoteEntity v inner join v.post  order by v.vote desc ";
		return sessionFactory.getCurrentSession().createQuery(sql).list();
	}
}
