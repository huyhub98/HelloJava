package com.linkin.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linkin.dao.ProductDao;
import com.linkin.entity.Product;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void insert(Product product) {
		entityManager.persist(product);

	}

	@Override
	public void update(Product product) {
		entityManager.merge(product);

	}

	@Override
	public void delete(Product product) {
		entityManager.remove(product);
	}

	@Override
	public List<Product> search(String findName, String categoryName, String thuongHieuName, String KichThuocName,
			String gioiTinhName, Long priceStart, Long priceEnd, int start, int length) {

		try {
			String hql = "SELECT p FROM Product p join p.category c"
					+ " join p.thuongHieu th"
					+ " join p.kichThuoc kt"
					+ " join p.gioiTinh gt "
					+ "where (p.name like:pname and c.name like:cname and th.name like:thname and kt.name like:ktname and gt.name like:gtname"
					+ " and (p.price between :priceStart AND :priceEnd ))";

			return entityManager.createQuery(hql, Product.class).setParameter("pname", "%" + findName + "%")
					.setParameter("cname", "%" + categoryName + "%").setParameter("thname", "%" + thuongHieuName + "%")
					.setParameter("ktname", "%" + KichThuocName + "%").setParameter("gtname", "%" + gioiTinhName + "%")
					.setParameter("priceStart", priceStart).setParameter("priceEnd", priceEnd).setFirstResult(start)
					.setMaxResults(length).getResultList();

		} catch (Exception e) {
			System.out.println("loi" + e);
		}
		return null;

	}

	@Override
	public Product get(Long id) {
		//return entityManager.find(Product.class, id);
		String hql="SELECT p FROM Product p join p.category c"
				+ " join p.thuongHieu th"
				+ " join p.kichThuoc kt"
				+ " join p.gioiTinh gt "
				+ "where p.id =:pId";
		return entityManager.createQuery(hql,Product.class).setParameter("pId", id).getSingleResult();
	}

	@Override
	public List<Product> searchByCategory(String findName, String thuongHieuName, String KichThuocName,
			String gioiTinhName, Long priceStart, Long priceEnd, Long categoryId, int start, int length) {
		String hql = "SELECT p FROM Product p  inner join Category c on c.id=p.category.id"
				+ " inner join ThuongHieu th  on p.thuongHieu.id=th.id"
				+ " inner join KichThuoc kt on p.kichThuoc.id=kt.id "
				+ " inner join GioiTinh gt on p.gioiTinh.id=gt.id "
				+ "where (p.name like:pname and p.category.id=:cId and p.thuongHieu.name like:thname and p.kichThuoc.name like:ktname and p.gioiTinh.name like:gtname"
				+ " and (p.price between :priceStart AND :priceEnd ))";

		return entityManager.createQuery(hql, Product.class).setParameter("pname", "%" + findName + "%")
				.setParameter("thname", "%" + thuongHieuName + "%").setParameter("gtname", "%" + gioiTinhName + "%")
				.setParameter("priceStart", priceStart).setParameter("priceEnd", priceEnd)
				.setParameter("ktname", "%" + KichThuocName + "%").setParameter("cId", categoryId).setFirstResult(start)
				.setMaxResults(length).getResultList();
	}

}
