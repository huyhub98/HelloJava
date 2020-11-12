package com.ifi.transport.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "street_address")
    private String streetAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "district_id")
    private District district;

    @Column(name = "is_delete")
    private boolean isDelete = false;
}
