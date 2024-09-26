package com.trungtamjava.dao;

import java.util.List;

import com.trungtamjava.model.Country;

public interface CountryDao {
	// CRUD
	void create(Country country);

	void update(Country country);

	void delete(int id);

	Country get(int id);

	List<Country> search(String name);

}
