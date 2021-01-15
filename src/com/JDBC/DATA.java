package com.JDBC;
import java.sql.*;

public class DATA  {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "DATABASE1", "admin");
		Statement S1 = con.createStatement();
		ResultSet res = S1.executeQuery("select * from students");
		while ( res.next()) { 
			
			System.out.println(res.getString(1)+ " " +res.getString(2));
		}
		
		con.close();
	}
	//Hello world
}
