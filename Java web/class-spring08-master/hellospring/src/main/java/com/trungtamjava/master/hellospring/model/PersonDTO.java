package com.trungtamjava.master.hellospring.model;

import java.util.List;

import lombok.Data;

@Data
//dong vai tro su dung tren view. hoac controller
public class PersonDTO {
	private int id;
	private String name;
	private List<PhoneDTO> phoneDTOs;
	private String password;


}
