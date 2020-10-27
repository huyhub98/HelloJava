package com.ifi.transport.model;

import lombok.Data;

import java.sql.Date;

@Data
public class TransportDTO {
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
