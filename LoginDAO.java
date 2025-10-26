package org.besanttechnologies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public static boolean validateLogin(Login login) {
		boolean flag = false;
		
		try {
			Connection conn = DBConnection.getDBConnection();
			PreparedStatement pstmt = conn.prepareStatement("select * from adminuser where username=? and password=?");
			pstmt.setString(1, login.getUsername());
			pstmt.setString(2, login.getPassword());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("data is matched. user is authenticated");
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
}
