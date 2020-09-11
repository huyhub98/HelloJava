package com.trungtamjava.master.hellospring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trungtamjava.master.hellospring.entity.PhoneEntity;

public interface PhoneRepository extends JpaRepository<PhoneEntity, Integer> {

	@Query("SELECT p FROM PhoneEntity p WHERE p.phoneNo LIKE :param")
	List<PhoneEntity> search(@Param("param") String phoneNo);

	@Query("SELECT p FROM PhoneEntity p JOIN p.personEntity person WHERE person.name LIKE :param")
	List<PhoneEntity> searchByPersonName(@Param("param") String personName);
}

