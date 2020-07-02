package com.quanghuy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.quanghuy.model.Car;
import com.quanghuy.model.Country;

public class CarDaoImpl extends JDBCConnection implements CarDao {

	@Override
	public void create(Car car) {
		try {
			String sql = "INSERT INTO car (id, name, price , manufacture, id_country) VALUES(?, ?, ?, ?, ? )";

			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, car.getId());
			statement.setString(2, car.getName());
			statement.setDouble(3, car.getPrice());
			statement.setString(4, car.getManufacture());
			statement.setInt(5, car.getCountry().getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Lỗi " + e);
		}
	}

	@Override
	public void update(Car car) {
		try {
			String sql = "UPDATE car SET id = ?, name = ?, price = ?, manufacture = ?, id_country = ? WHERE id = ?";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, car.getId());
			statement.setString(2, car.getName());
			statement.setDouble(3, car.getPrice());
			statement.setString(4, car.getManufacture());
			statement.setInt(5, car.getCountry().getId());
			statement.setInt(6, car.getId());

			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
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
			String sql = "SELECT car.*, country.country_name\n" + 
					"FROM car\n" + 
					"INNER JOIN country ON country.country_id = id_country\n" + 
					"WHERE car.id = ?;";

			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Car car = rowMapper(rs);
				return car;
			}
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return null;
	}

	private Car rowMapper(ResultSet rs) throws Exception {
		/// get theo du lieu + ten cot sql ben trong
		int id = rs.getInt("id");
		String carName = rs.getString("name");//
		long price = rs.getLong("price");
		String manufacture = rs.getString("manufacture");

		int countryId = rs.getInt("id_country");
		String countryName = rs.getString("country_name");

		Car car = new Car();
		car.setId(id);
		car.setName(carName);
		car.setPrice(price);
		car.setManufacture(manufacture);
		// tao doi tuong
		Country country = new Country();
		country.setId(countryId);
		country.setName(countryName);
		// set quan he
		car.setCountry(country);

		return car;
	}

	@Override
	public List<Car> search(String name) {
		List<Car> cars = new ArrayList<Car>();
		try {
			String sql = "SELECT car.*, country.country_name\n" + "FROM test_jdbc.car\n"
					+ "INNER JOIN country ON country.country_id = id_country\n" + "WHERE car.name LIKE ?;";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "%" + name + "%");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				//Car car = rowMapper(rs);
				Car car = new Car();
				car.setId(rs.getInt("id"));
				car.setManufacture(rs.getString("manufacture"));
				car.setName(rs.getString("name"));
				car.setPrice(rs.getDouble("price"));

				Country country = new Country();
				country.setId(rs.getInt("id_country"));
				country.setName(rs.getString("country_name"));
				car.setCountry(country);
				cars.add(car);
			}
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return cars;
	}

	@Override
	public List<Car> search(double fromPrice, double toPrice) {
		List<Car> cars = new ArrayList<Car>();
		try {
			String sql = "SELECT car.*, country.country_name\n" + 
					"FROM car\n" + 
					"INNER JOIN country ON country.country_id = car.id_country\n" + 
					"WHERE car.price >= ? AND car.price <= ? \n" + 
					"ORDER BY car.price ASC;";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setDouble(1, fromPrice);
			statement.setDouble(2, toPrice);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				//Car car = rowMapper(rs);
				Car car = new Car();
				car.setId(rs.getInt("id"));
				car.setName(rs.getString("name"));
				car.setManufacture(rs.getString("manufacture"));
				car.setPrice(rs.getDouble("price"));
				
				Country country = new Country();
				country.setId(rs.getInt("id_country"));
				country.setName(rs.getString("country_name"));
				car.setCountry(country);
				cars.add(car);
			}
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return cars;
	}
	
	@Override
	public List<Car> searchByManufacture(String manufacture) {
		List<Car> cars = new ArrayList<Car>();
		try {
			String sql = "SELECT car.*, country.country_name\n" 
					+ "FROM test_jdbc.car\n"
					+ "INNER JOIN country ON country.country_id = id_country\n" 
					+ "WHERE car.manufacture LIKE ?;";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, manufacture);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				//Car car = rowMapper(rs);
				Car car = new Car();
				car.setId(rs.getInt("id"));
				car.setName(rs.getString("name"));
				car.setManufacture(rs.getString("manufacture"));
				car.setPrice(rs.getDouble("price"));
				
				Country country = new Country();
				country.setId(rs.getInt("id_country"));
				country.setName(rs.getString("country_name"));
				car.setCountry(country);
				cars.add(car);
			}
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return cars;
	}

	@Override
	public long getCarAmount() {
		try {
			String sql = "SELECT COUNT(*) AS'Amount'\n" + 
					"FROM car;";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				return rs.getLong("Amount");
			}	
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return 0;
	}

	@Override
	public long totalPrice() {
		try {
			String sql = "SELECT SUM(price) AS 'tong' FROM car ";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			// gửi câu lệnh đi
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				return rs.getLong("tong");
			}
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return 0;
	}

	@Override
	public Car getMaxPrice() {
		try {
			String sql = "SELECT car.*, country_name\n" + 
					"FROM car\n" + 
					"INNER JOIN country ON country.country_id = car.id_country\n" + 
					"WHERE price = (SELECT MAX(price) FROM car) ;";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			// gửi câu lệnh
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Car car = rowMapper(rs);
				return car;
			}
		} catch (Exception e) {
			System.out.println("Lỗi " + e);
		}
		return null;
	}

}
