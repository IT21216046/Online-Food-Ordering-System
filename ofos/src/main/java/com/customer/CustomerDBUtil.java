package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<Customer> validate(String username,String password){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		
		
		try {
			
			
			con = DBConnect.getConnnection();
			stmt = con.createStatement();
			String sql = "select * from ofos.customer where username='"+username+"' and password= '"+password+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String usern = rs.getString(5);
				String passw = rs.getString(6);
				
				Customer c = new Customer(id,name,address,phone,usern,passw);
				cus.add(c);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return cus;
	}
	
	public static boolean InsertCustomer(String name,String address,String phone, String username,String password )
	{
		boolean isSuccess = false;
		
		
		
		try {
			
			con = DBConnect.getConnnection();
			stmt = con.createStatement();
			String sql = "insert into ofos.customer values(0,'"+name+"','"+address+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updateCustomer(String id,String name,String address,String phone, String username,String password)
	{
		boolean isSuccess = false;
		
		try
		{
			con = DBConnect.getConnnection();
			stmt = con.createStatement();
			String sql = "update customer set name='"+name+"',address='"+address+"',phone ='"+phone+"',username='"+username+"',password='"+password+"'"
					+ "where id  = '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public  static List<Customer> getCustomerDetails(String id)
	{
		
		int convertID = Integer.parseInt(id);
		ArrayList<Customer> cus = new ArrayList<>();
		
		
		try
		{
			con = DBConnect.getConnnection();
			stmt = con.createStatement();
			String sql = "select * from ofos.customer where id='"+convertID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String usern = rs.getString(5);
				String passw = rs.getString(6);
				
				Customer c = new Customer(id1,name,address,phone,usern,passw);
				cus.add(c);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return cus;
	}
	
	public static boolean deleteCustomer(String id)
	{
		int convertID = Integer.parseInt(id);
		
		boolean isSuccess = false;
		
		try
		{
			con = DBConnect.getConnnection();
			stmt = con.createStatement();
			String sql = "delete from customer where id ='"+convertID+"'";
			int rs = stmt.executeUpdate(sql);
			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}

}
