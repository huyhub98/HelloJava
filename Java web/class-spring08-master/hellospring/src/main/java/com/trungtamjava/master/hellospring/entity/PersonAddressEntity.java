package com.trungtamjava.master.hellospring.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

//bang trung gian giua person - address
@Entity
@Table(name = "person_address")
@Data
public class PersonAddressEntity {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// bat buoc
	// Lazy: load khi nao dung den (khi can)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id")
	private PersonEntity personEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	private AddressEntity addressEntity;
}
