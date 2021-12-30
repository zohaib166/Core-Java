package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	String url = "jdbc:mysql://localhost:3306/videouser?characterEncoding=utf8";
	String username = "root";
	String password = "zohaib";
	String query = "select * from user where uname=? and pwd=?";
	public boolean checkUser(String uname, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,username, password);
			PreparedStatement ps = conn.prepareStatement(query); 
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
