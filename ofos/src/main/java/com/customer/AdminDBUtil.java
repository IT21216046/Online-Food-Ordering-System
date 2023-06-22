package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<Admin> validate(String username,String password){
		
		ArrayList<Admin> ad = new ArrayList<>();
		
		
		
		try {
			
			
			con = DBConnect.getConnnection();
			stmt = con.createStatement();
			String sql = "select * from systemadmin where adminname='"+username+"' and adminpassword= '"+password+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String pass = rs.getString(3);
				
				
				Admin a = new Admin(id,name,pass);
				ad.add(a);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ad;
	}

}
