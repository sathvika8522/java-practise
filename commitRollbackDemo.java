package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class commitRollbackDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Umashankar");  
			Statement stmt1=con.createStatement();  
			con.setAutoCommit(false);
			 
			int a;
			stmt1.executeUpdate("insert into shivaya values('jin','korea',30,6)");
			
			Savepoint s1=con.setSavepoint();
			
			System.out.println("want to save it ");
			a=sc.nextInt();
			if(a==1)
				con.commit();
			else
				con.rollback();
			
			ResultSet rs4=stmt1.executeQuery("select * from shivaya");
			while(rs4.next())
			{
				System.out.println("[ name: "+rs4.getString(1)+", place: "+rs4.getString(2)+", age: "+rs4.getInt(3)+", id: "+rs4.getInt(4)+"]");
			}
			

			
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}

}
