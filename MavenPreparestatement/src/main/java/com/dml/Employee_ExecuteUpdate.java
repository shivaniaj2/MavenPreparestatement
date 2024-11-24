package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Employee_ExecuteUpdate {
	public void Insert()throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad","root","Shivani@2003");
	PreparedStatement ps=c.prepareStatement("insert into employee values(?,?)");
	ps.setInt(1,14);
	ps.setString(2,"kiran");
	ps.executeUpdate();
	
	System.out.println("Insert data Successfully....");
	c.close();
	
	}
	public void Update() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("update employee set name=? where emp_id=?");
		ps.setString(1,"Shiv");
		ps.setInt(2, 14);
		ps.executeUpdate();
		
		System.out.println("Update data Successfully....");
		c.close();	
	}
	public void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("delete from employee where emp_id=?");
		ps.setInt(1,19);
		ps.executeUpdate();
		System.out.println("Delete data Successfully....");
		c.close();
	}
	public static void main(String[] args) throws Exception {
		Employee_ExecuteUpdate I=new Employee_ExecuteUpdate();
		//I.Insert();
		//I.Update();
		//I.delete();
		
	}
	

}
