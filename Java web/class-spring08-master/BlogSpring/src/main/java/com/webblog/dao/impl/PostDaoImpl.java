package com.webblog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webblog.dao.PostDao;
import com.webblog.entity.PostEntity;


@Repository
@Transactional
public class PostDaoImpl implements PostDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void addPost(PostEntity post) {
		sessionFactory.getCurrentSession().save(post);
	}

	public void delPost(int id) {
		sessionFactory.getCurrentSession().delete(getPostId(id));
		
	}

	public void updatePost(PostEntity post) {
		sessionFactory.getCurrentSession().merge(post);
	}

	public List<PostEntity> search(String name) {
		String hql = "SELECT p FROM PostEntity p WHERE p.name like :name ";
		return sessionFactory.getCurrentSession().createQuery(hql).setParameter("name", "%"+name+"%").list();
	}

	public List<PostEntity> search(int categoryid) {
		String hql = "SELECT p FROM PostEntity p WHERE p.id = :id ";
		return  sessionFactory.getCurrentSession().createQuery(hql).setParameter("id", categoryid).list();
		}

	public PostEntity getPostId(int id) {
		String hql = "SELECT n FROM PostEntity n WHERE n.id = :id ";
		return (PostEntity) sessionFactory.getCurrentSession().createQuery(hql).setParameter("id", id).uniqueResult();

	}

	public PostEntity getPostName(String name) {
		String sql = "SELECT p FROM PostEntity p WHERE name = :name ";
		return  (PostEntity) sessionFactory.getCurrentSession().createQuery(sql).setParameter("name", name).uniqueResult();
	}

	public List<PostEntity> limit(int off) {
		String hql = "FROM PostEntity ";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(off);
		query.setMaxResults(3);
		return 	query.list();
	}

}
