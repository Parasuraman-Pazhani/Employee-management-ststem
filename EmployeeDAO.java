package org.besanttechnologies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	public static Employee getEmployee(String employeename) {
		Employee empl = new Employee();
		try {
			
		Connection conn =	DBConnection.getDBConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from employee where employeename=?");
		pstmt.setString(1, employeename);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			empl.setEmployeename(rs.getString("employeename"));
			empl.setEmplocation(rs.getString("emplocation"));
			empl.setEmpage(rs.getInt("empage"));
		}
		
		} catch(Exception ex) {
			System.err.println(ex);
		}
		
		
		return empl;
	}
	
	public static List<Employee> getEmployeeList() {
		List<Employee> emplList = new ArrayList<>();
		try {
			
		Connection conn =	DBConnection.getDBConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from employee");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Employee empl = new Employee();
			empl.setEmployeename(rs.getString("employeename"));
			empl.setEmplocation(rs.getString("emplocation"));
			empl.setEmpage(rs.getInt("empage"));
			emplList.add(empl);
		}
		
		} catch(Exception ex) {
			System.err.println(ex);
		}
		
		
		return emplList;
	}
	
	public static List<Employee> insertEmployee(Employee employ) {
		List<Employee> emplList = new ArrayList<>();
		try {
			
		Connection conn =	DBConnection.getDBConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setString(1, employ.getEmployeename());
		pstmt.setString(2, employ.getEmplocation());
		pstmt.setInt(3, employ.getEmpage());
		
		
		int result = pstmt.executeUpdate();
		if(result > 0) {
			
			PreparedStatement pstmt1 = conn.prepareStatement("select * from employee");
			ResultSet rs = pstmt1.executeQuery();
			while(rs.next()) {
				Employee empl = new Employee();
				empl.setEmployeename(rs.getString("employeename"));
				empl.setEmplocation(rs.getString("emplocation"));
				empl.setEmpage(rs.getInt("empage"));
				emplList.add(empl);
			}
			
		}
		
		} catch(Exception ex) {
			System.err.println(ex);
		}
		
		
		return emplList;
	}
	
	public static List<Employee> deleteEmployee(String employeename) {
		List<Employee> emplList = new ArrayList<>();
		try {
			
		Connection conn =	DBConnection.getDBConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("delete from employee where employeename=?");
		pstmt.setString(1, employeename);

		
		int result = pstmt.executeUpdate();
		if(result > 0) {
			
			PreparedStatement pstmt1 = conn.prepareStatement("select * from employee");
			ResultSet rs = pstmt1.executeQuery();
			while(rs.next()) {
				Employee empl = new Employee();
				empl.setEmployeename(rs.getString("employeename"));
				empl.setEmplocation(rs.getString("emplocation"));
				empl.setEmpage(rs.getInt("empage"));
				emplList.add(empl);
			}
			
		}
		
		} catch(Exception ex) {
			System.err.println(ex);
		}
		
		
		return emplList;
	}
}
