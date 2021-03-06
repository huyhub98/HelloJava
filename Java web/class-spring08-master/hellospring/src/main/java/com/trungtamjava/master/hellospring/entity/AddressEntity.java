package com.trungtamjava.master.hellospring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "address")
public class AddressEntity {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// neu ko dung @Column mac dinh ten cot la ten bien
	private String street;
	private String district;
	
}
