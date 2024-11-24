package com.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Employee_Execute {
	public void createTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad","root","Shivani@2003");
		PreparedStatement ps = c.prepareStatement("CREATE TABLE student1 (stu_id INT PRIMARY KEY, name VARCHAR(30), marks INT)");
        ps.execute();
		System.out.println("Table Created Successfully...");
		c.close();
		
	}
	
	public void alterTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("ALTER TABLE student1 ADD age INT");
		ps.execute();
		System.out.println("Table Alter Successfully....");
		c.close();
	}
	public void dropTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("DROP TABLE student1");
		ps.execute();
		System.out.println("Table is drop Successfully....");
		c.close();
	}
	public void truncate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad","root","Shivani@2003");
		Statement s=c.createStatement();
		s.execute("TRUNCATE TABLE student2;");
		System.out.println("Table is Truncate Successfully....");
		c.close();
	}
	
	public static void main(String[] args) throws Exception {
		Employee_Execute E=new Employee_Execute();
		//E.createTable();
		//E.alterTable();
		//E.dropTable();
	E.truncate();
	}
	

}
