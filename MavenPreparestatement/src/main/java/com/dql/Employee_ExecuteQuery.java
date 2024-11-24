package com.dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employee_ExecuteQuery {
	public void FetchData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("select*from employee");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("Employee_Id= "+rs.getInt(1)+" Employee_Name= "+rs.getString(2));
		}
		
		c.close();
	}
	public static void main(String[] args) throws Exception {
		Employee_ExecuteQuery Q=new Employee_ExecuteQuery();
		Q.FetchData();
	}

}
