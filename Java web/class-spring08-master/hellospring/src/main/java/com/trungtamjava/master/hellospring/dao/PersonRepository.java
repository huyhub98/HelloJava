package com.trungtamjava.master.hellospring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trungtamjava.master.hellospring.entity.PersonEntity;

//dung thu vien san cua spring jpa
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

	@Query("SELECT p FROM PersonEntity p WHERE p.name LIKE :param OR p.address LIKE :param")
	List<PersonEntity> search(@Param("param") String keyword);

	@Query("SELECT p FROM PersonEntity p WHERE p.age >= :param1 AND p.age <= :param2")
	List<PersonEntity> search(@Param("param1") int fromAge, @Param("param2") int toAge);

	@Query("SELECT p FROM PersonEntity p JOIN p.phoneEntities phone "
			+ " JOIN phone.countryEntity c WHERE c.name = :param")
	List<PersonEntity> searchByPhoneCountry(@Param("param") String countryName);

//	@Query("SELECT p FROM PersonEntity p JOIN PhoneEntity phone ON p.id = phone.personEntity.id "
//			+ "  WHERE phone.phoneNo = :param")
//	List<PersonEntity> searchByPhone(@Param("param") String phoneNo);

	@Query("SELECT p FROM PersonEntity p JOIN p.personAddressEntities pAddress "
			+ " JOIN pAddress.addressEntity address WHERE address.district = :param")
	List<PersonEntity> searchByDistrict(@Param("param") String district);

	@Query("SELECT p FROM PersonEntity p WHERE p.username = :param")
	PersonEntity getByUsername(@Param("param") String username);
}
