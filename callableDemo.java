package jdbcDemo;

import java.sql.*;


public class callableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Umashankar");  
		Statement stmt=con.createStatement();  
		con.setAutoCommit(false);
		
		String s="create or replace procedure 'samp' (id IN NUMBER name IN VARCHAR2) is begin insert into user420 values(id,name);end;/";
		stmt.execute(s);
		con.commit();
		
		CallableStatement cstmt=con.prepareCall("{call INSERTR(?,?)}");  
		cstmt.setInt(1,8);
		cstmt.setString(2,"India");
		
        cstmt.execute();
        System.out.println("success :)");
        
          
 
	}

}
