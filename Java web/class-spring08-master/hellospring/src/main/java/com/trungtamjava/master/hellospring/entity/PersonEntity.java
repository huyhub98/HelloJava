package com.trungtamjava.master.hellospring.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

//dong vai tro: map voi table trong datable
@Entity
@Table(name = "person")
@Data // dung thu vien lombok de gen set get tu dong
public class PersonEntity {

	@Column(name = "id")
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// neu ko dung @Column mac dinh ten cot la ten bien
	private String name;

	private int age;

	private String address;

	private String username;
	private String password;
	private String role;// ROLE_ADMIN, ROLE_MEMBER
	private boolean enabled;// true, false

	// Tao quan he phu - map nguoc lai
	// mapBy chinh la cai bien ben phoneEntity
	@OneToMany(mappedBy = "personEntity", fetch = FetchType.LAZY)
	private List<PhoneEntity> phoneEntities;

	@OneToMany(mappedBy = "personEntity", fetch = FetchType.LAZY)
	private List<PersonAddressEntity> personAddressEntities;
	// tu dong gen ra set get = lombok

}
