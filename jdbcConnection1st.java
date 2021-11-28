package jdbcDemo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;  
public class jdbcConnection1st {

	public static void main(String[] args) {
		String n,p;
		int a,id;
		Scanner sc=new Scanner(System.in);
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Umashankar");  
			Statement stmt=con.createStatement();  
			con.setAutoCommit(false);
			
			PreparedStatement pstmt=con.prepareStatement("insert into shivaya values(?,?,?,?)");
			con.commit();
			
			int f;
			do
			{
				System.out.println("Enter name place age id");
				n=sc.next();
				p=sc.next();
				a=sc.nextInt();
				id=sc.nextInt();
				
				pstmt.setString(1, n);
				pstmt.setString(2, p);
				pstmt.setInt(3, a);
				pstmt.setInt(4, id);
				
				pstmt.executeUpdate();
				System.out.println("Inserted :)");
				System.out.println("want to insert another row ");
			    f=sc.nextInt();
			}while(f!=0);
			con.commit();
			
			ResultSet rs=stmt.executeQuery("select * from shivaya");
			while(rs.next())
			{
				System.out.println(" name "+rs.getString(1)+" place "+rs.getString(2)+" 0age "+rs.getInt(3)+"id "+rs.getInt(4));
			}
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  

	}

}
