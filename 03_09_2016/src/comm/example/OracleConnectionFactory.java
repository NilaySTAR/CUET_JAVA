package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionFactory {

	private Connection connection = null;

	public Connection getOracleConnection() {
		
		//Imran 105

		// step-1
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//step 2
		    connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		} catch (SQLException e) {

			System.out.println("Connection Did Not Establish...");
		}
		return connection;
	}

}
