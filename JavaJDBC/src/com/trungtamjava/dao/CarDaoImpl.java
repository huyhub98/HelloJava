package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.Car;
import com.trungtamjava.model.Country;

public class CarDaoImpl extends JDBCConnection implements CarDao {

	@Override
	public void create(Car car) {
		try {
			String sql = "INSERT INTO car(name, price, manufacture, country_id ) VALUES(?, ?, ?, ?);";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			statement.setString(1, car.getName());
			statement.setLong(2, car.getPrice());
			statement.setString(3, car.getManufacture());
			statement.setInt(4, car.getCountry().getId());
			/// GUI CAU LENH DI
			statement.executeUpdate();

			/// LAY VE ID TU GEN SET VAO car nếu trường hợp ko nhập id từ bàn phím vào mà de database tự sinh
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				int id = rs.getInt(1);// id dc gen o db , trong database cột ID phải được tích chon AI (Auto INcrement) nhé
				// set vao doi tuong de su dung trong class khac
				car.setId(id);
			}
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
	}

	@Override
	public void update(Car car) {
		try {
			String sql = "UPDATE car SET name = ?, price = ?, manufacture = ?, country_id = ? WHERE id = ?";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, car.getName());
			statement.setLong(2, car.getPrice());
			statement.setString(3, car.getManufacture());
			statement.setInt(4, car.getCountry().getId());
			statement.setInt(5, car.getId());

			/// GUI CAU LENH DI
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM car WHERE id = ?;";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
	}

	@Override
	public Car get(int id) {
		try {
			String sql = "SELECT car.*, country.name AS 'c_name' FROM car "
					+ " INNER JOIN country ON car.country_id = country.id "
					+ " WHERE car.id = ?;";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				/// get theo du lieu + ten cot sql ben trong
				Car car = rowMapper(rs);
				return car;// tra ve doi tuong tim thay dau tien
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return null;
	}

	@Override
	public List<Car> search(String name) {
		List<Car> cars = new ArrayList<Car>();

		try {
			String sql = "SELECT car.*, country.name AS 'c_name' FROM car "
					+ " INNER JOIN country ON car.country_id = country.id "
					+ " WHERE car.name LIKE ?";
			//"SELECT * FROM car WHERE name LIKE ?;";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, "%" + name + "%");

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				Car car = rowMapper(rs);
				cars.add(car);// chen vao list
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return cars;
	}

	@Override
	public List<Car> search(long fromPrice, long toPrice) {
		List<Car> cars = new ArrayList<Car>();

		try {
			String sql = "SELECT car.*, country.name AS 'c_name' FROM car "
					+ " INNER JOIN country ON car.country_id = country.id "
					+ " WHERE car.price >= ? AND car.price <= ? ORDER BY car.price ASC";
			//"SELECT * FROM car WHERE price >= ? AND price <= ? ORDER BY price ASC;";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setLong(1, fromPrice);
			statement.setLong(1, toPrice);
			
			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				Car car = rowMapper(rs);
				cars.add(car);// chen vao list
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return cars;
	}
	
	@Override
	public List<Car> searchByManufature(String manufacture) {
		List<Car> cars = new ArrayList<Car>();

		try {
			String sql = "SELECT car.*, country.name AS 'c_name' FROM car "
					+ " INNER JOIN country ON car.country_id = country.id "
					+ " WHERE car.manufacture = ?";
			//"SELECT * FROM car WHERE manufacture = ?";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, manufacture);
			
			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				Car car = rowMapper(rs);
				cars.add(car);// chen vao list
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return cars;
	}

	private Car rowMapper(ResultSet rs) throws Exception {
		/// get theo du lieu + ten cot sql ben trong
		int id = rs.getInt("id");
		String carName = rs.getString("name");//
		long price = rs.getLong("price");
		String manufacture = rs.getString("manufacture");

		int countryId = rs.getInt("country_id");
		String countryName = rs.getString("c_name");
		
		Car car = new Car();
		car.setId(id);
		car.setName(carName);
		car.setPrice(price);
		car.setManufacture(manufacture);
		//tao doi tuong 
		Country country = new Country();
		country.setId(countryId);
		country.setName(countryName);
		//set quan hej
		car.setCountry(country);

		return car;
	}

}
