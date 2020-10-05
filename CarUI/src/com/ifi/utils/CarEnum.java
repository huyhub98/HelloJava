/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifi.utils;

/**
 *
 * @author nqhuy
 */
public enum CarEnum {
    HONDA("honda"), AUDI("audi"), MERCEDEZ("mercedez"), TOYOTA("toyota"), VINFAST("vinfast");

    private String brand;

    private CarEnum(String brand) {

        this.brand = brand;

    }

    public String getBrand() {

        return brand;

    }

    public void setBrand(String brand) {

        this.brand = brand;

    }

}
