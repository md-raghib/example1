package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.csc.bean.User;

public class LoginDAO {

	private static Connection conn;

	

	public static void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost/asset_management?" + "user=root&password=cscindia@123");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}// connect

	public static User loginUser(User user) {
		PreparedStatement pmt = null;
		ResultSet rs=null;
		try {
			pmt = conn.prepareStatement("select first_name,last_name,password,email from user where email=? and password=?");
			System.out.println("email="+user.getEmail());
			System.out.println("password"+user.getPassword());
			pmt.setString(1, user.getEmail());
			pmt.setString(2, user.getPassword());
			rs=pmt.executeQuery();
			while(rs.next()){
				
				user.setFirstName(rs.getString(1));
				user.setEmail(rs.getString(4));
			
				return user;
			}
			
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pmt != null) {
					pmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return null;
	}// createUser

	
}
