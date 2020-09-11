package com.trungtamjava.master.hellospring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

//1 person - n phones : fk:  bang n - person_id
//1 country - n phones: 
@Entity
@Table(name = "phone")
@Data
public class PhoneEntity {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// neu ko dung @Column mac dinh ten cot la ten bien
	@Column(name = "phone_no")
	private String phoneNo;

	// bat buoc
	// Lazy: load khi nao dung den (khi can)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id")
	private PersonEntity personEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private CountryEntity countryEntity;
}
