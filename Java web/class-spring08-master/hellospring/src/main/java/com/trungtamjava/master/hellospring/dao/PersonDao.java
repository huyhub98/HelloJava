package com.trungtamjava.master.hellospring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trungtamjava.master.hellospring.entity.PersonEntity;

public interface PersonDao {
	void add(PersonEntity p);

	void update(PersonEntity p);

	void delete(PersonEntity p);

	PersonEntity get(int id);

	List<PersonEntity> search(String keyword);

	List<PersonEntity> search(int fromAge, int toAge);
}

@Repository
@Transactional /// quan ly giao dich.
//dam bao tat ca cac ham deu thanh cong hoac faile
class PersonDaoImpl implements PersonDao {

//	@Autowired
//	DataSource datasource;
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void add(PersonEntity p) {
		entityManager.persist(p);// add
	}

	@Override
	public void update(PersonEntity p) {
		entityManager.merge(p);
	}

	@Override
	public void delete(PersonEntity p) {
		entityManager.remove(p);
	}

	@Override
	public PersonEntity get(int id) {
		return entityManager.find(PersonEntity.class, id);
	}

	@Override
	public List<PersonEntity> search(String keyword) {
		// jqlh - hql
		String hql = "SELECT p FROM PersonEntity p WHERE p.name LIKE :param OR p.address LIKE :param";
		Query query = entityManager.createQuery(hql);
		query.setParameter("param", "%" + keyword + "%");

		return query.getResultList();
	}

	@Override
	public List<PersonEntity> search(int fromAge, int toAge) {
		String hql = "SELECT p FROM PersonEntity p WHERE p.age >= :param1 AND p.age <= :param2";
		Query query = entityManager.createQuery(hql);
		query.setParameter("param1", fromAge);
		query.setParameter("param2", toAge);
		return query.getResultList();
	}
}