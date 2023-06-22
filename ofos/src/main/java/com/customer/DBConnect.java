package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/ofos";
	private static  String username = "root";
	private  static String password = "Nbw@20001224";
	private static Connection con;
	
	public static Connection getConnnection() throws SQLException
	{
		if (con == null || con.isClosed())
		{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			
		}
		catch(Exception e)
		{
			System.out.print("BDConnection is not success");
		}
		
		}
		return con;
	}

}
