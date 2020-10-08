/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifi.dao;

import com.ifi.model.CarBrand;
import com.ifi.model.Car;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nqhuy
 */
public class CarDaoImpl extends JDBCConnection implements CarDao {

    @Override
    public void create(Car car) {
        try {
            String sql = "INSERT INTO car (id, name, price, model, id_brand) VALUES (?,?,?,?,?)";
            Connection conn = super.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, car.getId());
            statement.setString(2, car.getName());
            statement.setLong(3, car.getPrice());
            statement.setString(4, car.getModel());
            statement.setInt(5, car.getBrand().getId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Car car) {
        try {
            String sql = "UPDATE car SET id = ?, name = ?, price = ?, id_brand = ? WHERE id = ?";
            Connection conn = super.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, car.getId());
            statement.setString(2, car.getName());
            statement.setLong(3, car.getPrice());
            statement.setInt(4, car.getBrand().getId());
            statement.setInt(5, car.getId());

            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {

            String sql = "DELETE FROM car WHERE id = ?";
            Connection conn = super.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Lỗi " + e);
        }
    }

    @Override
    public Car getId(int id) {
        try {
			String sql = "SELECT car.*, brand.name \n" + 
					"FROM car\n" + 
					"INNER JOIN brand ON brand.id = id_brand\n" + 
					"WHERE car.id = ?;";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Car car = new Car();
				car.setId(rs.getInt("id"));
				car.setName(rs.getString("name"));
				car.setPrice(rs.getLong("price"));

				CarBrand brand = new CarBrand();
				brand.setId(rs.getInt("id_brand"));
				brand.setName(rs.getString("name"));
				car.setBrand(brand);

				return car;
			}
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
        return null;
    }

}
