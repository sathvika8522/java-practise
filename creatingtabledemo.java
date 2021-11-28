package jdbcDemo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;  
public class creatingtabledemo {

	public static void main(String[] args) {
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Umashankar");  
			Statement stmt=con.createStatement();  
			con.setAutoCommit(false);
			
			stmt.addBatch("update shivaya set name='omsri' where id=1");
			stmt.addBatch("insert into shivaya values('jimin','korea',26,10)");
			
			stmt.executeBatch();
			
			con.commit();
			
			ResultSet rs3=stmt.executeQuery("select * from shivaya");
			while(rs3.next())
			{
				System.out.println("[ name: "+rs3.getString(1)+", place: "+rs3.getString(2)+", age: "+rs3.getInt(3)+", id: "+rs3.getInt(4)+"]");
			}
			
			
			
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  

	}

}
