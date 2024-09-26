package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.Country;

public class CountryDaoImpl extends JDBCConnection implements CountryDao {

	@Override
	public void create(Country country) {
		try {
			String sql = "INSERT INTO country(name) VALUES(?)";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			statement.setString(1, country.getName());

			/// GUI CAU LENH DI
			statement.executeUpdate();

			/// LAY VE ID TU GEN SET VAO car nếu trường hợp ko nhập id từ bàn phím vào mà de database tự sinh
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				int id = rs.getInt(1);// id dc gen o db , trong database cột ID phải được tích chon AI (Auto INcrement) nhé
				// set vao doi tuong de su dung trong class khac
				country.setId(id);
			}
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
	}

	@Override
	public void update(Country country) {
		try {
			String sql = "UPDATE country SET name = ? WHERE id = ?";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, country.getName());
			statement.setInt(2, country.getId());

			/// GUI CAU LENH DI
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM country WHERE id = ?;";

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
	public Country get(int id) {
		try {
			String sql = "SELECT * FROM country WHERE id = ?;";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				/// get theo du lieu + ten cot sql ben trong
				Country country = rowMapper(rs);//gom việc đọc từng cột vào 1 hàm riêng để cho đỡ rối mắt và dùng lại
				return country;// tra ve doi tuong tim thay dau tien
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return null;
	}

	@Override
	public List<Country> search(String name) {
		List<Country> countries = new ArrayList<Country>();

		try {
			String sql = "SELECT * FROM country WHERE name LIKE ?;";

			/// Setup cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, "%" + name + "%");

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				Country country = rowMapper(rs);//gom việc đọc từng cột vào 1 hàm riêng để cho đỡ rối mắt và dùng lại
				countries.add(country);// chen vao list
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return countries;
	}

	private Country rowMapper(ResultSet rs) throws Exception {
		/// get theo du lieu + ten cot sql ben trong
		int id = rs.getInt("id");
		String name = rs.getString("name");//

		Country country = new Country();
		country.setId(id);
		country.setName(name);

		return country;
	}

}
