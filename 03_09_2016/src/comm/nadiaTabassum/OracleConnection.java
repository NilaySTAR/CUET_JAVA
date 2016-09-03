package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
	private Connection connection=null;
	public Connection getOracleConnection()
	{
		//Step-1
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			//Step-2
			
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Did Not Established...!");
			e.printStackTrace();
		}
		
		return connection;
		
	}

}
