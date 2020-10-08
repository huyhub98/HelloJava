/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifi.dao;

import com.ifi.model.Car;

/**
 *
 * @author nqhuy
 */
public interface CarDao {

    void create(Car car);

    void update(Car car);

    void delete(int id);
    
    Car getId (int id);
}
