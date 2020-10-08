/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifi.dao;

import com.ifi.model.CarBrand;
import java.util.List;

/**
 *
 * @author nqhuy
 */
public interface BrandDao {

    void create(CarBrand brand);

    void update(CarBrand brand);

    void delete(int id);

    CarBrand getBrand(CarBrand carBrand);
    
    List<CarBrand> getBrands ();
}
