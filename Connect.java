package com.login;
import java.sql.*;

public class Connect {
	
	static Connection con;
	public static Connection connect()
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/login_page";
			String user = "root";
			String password = "12345";
			//Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
