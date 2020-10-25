package com.ifi.transport.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "transportation")
public class Transport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String status;
	private String sendDes;
	private String receiveDes;
	private Date initDate;
	private Date finishDate;
	private String shipManu;
	private String description;
	private double weight;
	private int shippingFee;
	private int charges;
}
