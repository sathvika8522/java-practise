package jdbcDemo;

import java.sql.*;
import java.util.Scanner;

import javax.swing.*; 

public class omsrisairam {

	public static void main(String[] args) {
		String n1,p1;
		int a1,id1;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Umashankar");
			Statement stmt=con.createStatement();
			con.setAutoCommit(false);
			String n;
			
			do
			{
			    n=JOptionPane.showInputDialog("Enter option  ");
				switch(n)
				{
				  case "1":
					  PreparedStatement pstmt=con.prepareStatement("insert into shivaya values(?,?,?,?)");
					  System.out.println("Enter name place age id");
						n1=sc.next();
						p1=sc.next();
						a1=sc.nextInt();
						id1=sc.nextInt();
						
						pstmt.setString(1, n1);
						pstmt.setString(2, p1);
						pstmt.setInt(3, a1);
						pstmt.setInt(4, id1);
						
						pstmt.executeUpdate();
						con.commit();
						break;
						
				  case "2":
					  String s=JOptionPane.showInputDialog("Enter query to update");
					  stmt.executeUpdate(s);
					  con.commit();
					  break;
				 case "3":
					 String s1=JOptionPane.showInputDialog("Enter query to delete");
					 stmt.executeUpdate(s1);
					 con.commit();
					 break;
				 case "4":
					 String s2=JOptionPane.showInputDialog("Enter query to alter");
					 stmt.executeUpdate(s2);
					 con.commit();
					 break;
				 case "5":
					 ResultSet rs=stmt.executeQuery("select * from shivaya");
					 while(rs.next())
					 {
						 System.out.println("[Name:"+rs.getString(1)+",place:"+rs.getString(2)+",age:"+rs.getInt(3)+",id"+rs.getInt(4)+"]");
					 }
					 break;
				 case "6":
					 System.out.println("Invalid");
					 break;
				}
				
			}while(n!="6");
		}catch(Exception e) {};
		
	}

}
