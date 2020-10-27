package com.ifi.transport.entity;

import java.sql.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "transportation")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "send_des")
    private String sendDes;

    @Column(name = "receive_des")
    private String receiveDes;

    @Column(name = "init_date")
    private Date initDate;

    @Column(name = "finish_date")
    private Date finishDate;

    @Column(name = "ship_manu")
    private String shipManu;

    @Column(name = "description")
    private String description;

    @Column(name = "weight")
    private double weight;

    @Column(name = "shipping_fee")
    private int shippingFee;

    @Column(name = "charges")
    private int charges;
}
