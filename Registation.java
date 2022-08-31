package com.login;
import java.sql.*;

public class Registation {
	
	private String uName,password;
	public boolean flag;
	
	Registation(String uName,String password)
	{
		this.uName = uName;
		this.password = password; 
	}

	public void setData()
	{
		try {
			Connection con = Connect.connect();
			String query = "insert into login(user,password) values(?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1,uName );
			pst.setString(2, password);
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getData()
	{ 
		try {
			Connection con = Connect.connect();
			String query = "select * from login";
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			
			
			while(rs.next())
			{
				if(rs.getString(1).equals(uName) && rs.getString(2).equals(password))
				{
					 flag = true;
					 break;
				}
				else
				{
					flag = false;
				}
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
