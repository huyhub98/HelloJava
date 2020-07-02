package com.quanghuy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.quanghuy.model.Country;

public class CountryDaoImpl extends JDBCConnection implements CountryDao {

	@Override
	public void create(Country country) {
		try {
			String sql = "INSERT INTO country(country_id, country_name) VALUES(?, ?)";

			// Setup câu lệnh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, country.getId());
			statement.setString(2, country.getName());

			// Gửi câu lệnh đi
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
	}

	@Override
	public void update(Country country) {
		try {
			String sql = "UPDATE country SET country_name = ? WHERE country_id = ?";
			
			// Setup câu lệnh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, country.getName());
			statement.setInt(2, country.getId());
			
			// Gửi câu lệnh
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM country WHERE country_id = ?";
			
			// Set up câu lệnh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);
			
			// Gửi câu lệnh
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
	}

	@Override
	public Country get(int id) {
		try {
			String sql = "SELECT * FROM country WHERE country_id = ?";
			
			// Setup câu lệnh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);

			// Gửi câu lệnh
			ResultSet rs = statement.executeQuery();

			// get dữ liệu + tên cột sql bên trong
			while (rs.next()) {
				id = rs.getInt("country_id");
				String name = rs.getString("country_name");

				Country country = new Country();
				country.setId(id);
				country.setName(name);
				return country; // trả về đối tượng tìm thấy đầu tiên
			}

		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return null;
	}

	@Override
	public List<Country> search(String name) {
		List<Country> countries = new ArrayList<Country>();
		try {
			String sql = "SELECT * FROM country WHERE country_name LIKE ?";
			
			// Setup câu lệnh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "%" + name + "%");
			
			// Gửi câu lệnh
			ResultSet rs = statement.executeQuery();

			// get dữ liệu + tên cột sql bên trong
			while (rs.next()) {
				int id = rs.getInt("country_id");
				name = rs.getString("country_name");

				Country country = new Country();
				country.setId(id);
				country.setName(name);
				countries.add(country);
			}

		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return countries;
	}

}
