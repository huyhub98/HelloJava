/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifi.dao;

import com.ifi.model.Car;
import com.ifi.model.CarBrand;
import com.ifi.test.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nqhuy
 */
public class BrandDaoImpl extends JDBCConnection implements BrandDao {

    @Override
    public void create(CarBrand brand) {
        try {
            String sql = "INSERT INTO brand (id, brand_name) VALUES (?,?)";
            Connection conn = super.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, brand.getId());
            statement.setString(2, brand.getName());

            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(CarBrand brand) {
        try {
            String sql = "UPDATE brand SET id = ?, brand_name = ? WHERE id = ?";
            Connection conn = super.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, brand.getId());
            statement.setString(2, brand.getName());

            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {

            String sql = "DELETE FROM brand WHERE id = ?";
            Connection conn = super.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Lỗi " + e);
        }
    }

    @Override
    public CarBrand getBrand(CarBrand carBrand) {
        try {
            String sql = "SELECT brand_name FROM cardb.brand";
            Connection conn = super.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {

                carBrand.setName(rs.getString("brand_name"));

                return carBrand;
            }
        } catch (Exception e) {
        }
        return null;

    }

    @Override
    public List<CarBrand> getBrands() {
        CarBrand carBrand = new CarBrand();
        List<CarBrand> carBrands = new ArrayList<CarBrand>();
        try {
            String sql = "SELECT * FROM cardb.brand";
            Connection conn = super.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {

                carBrand.setName(rs.getString("name"));
                carBrands.add(carBrand);

                return carBrands;
            }
        } catch (Exception e) {
        }
        return null;
    }

}
