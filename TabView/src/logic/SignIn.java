package logic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import loginPage.Login;

public class SignIn {
	 public static Boolean check(String a,String b){
		 
		 try {
				Class.forName("com.mysql.jdbc.Driver");
				
				//Connection con=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12360116","sql12360116","9q9uecUdnT");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
				Statement stmt=con.createStatement();
				String sql="Select * from login where user='"+a+"' and pass='"+b+"'";
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next())
					{return true;
					
					
					}
				else
					JOptionPane.showMessageDialog(null, "Incorrect Login info");
				con.close();
			}catch (Exception y) {System.out.print(y);}
		
		
		return null;
		
	}
}
