package comm.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//*****Imran 105******

public class EmployeeFactory {
	private Statement statement = null;
	private Connection con;
	private ResultSet rs = null;
	private List<Employee> list = null;
	OracleConnectionFactory factory = null;

	public EmployeeFactory() {
		super();
		list = new ArrayList<Employee>();
		factory = new OracleConnectionFactory();
	}

	public void displayEmployee() throws SQLException {
		con = factory.getOracleConnection();
		statement = con.createStatement();
		rs = statement
				.executeQuery("select e.employee_id,e.last_name,e.first_name,d.department_name from employees e,departments d where e.department_id=d.department_id");
		while (rs.next()) {

			int id = rs.getInt(1);
			String employeeLastName = rs.getString(2);
			String employeeFirstName = rs.getString(3);
			String DepartmentName = rs.getString(4);
			Employee e = new Employee(id, employeeLastName, employeeFirstName,
					DepartmentName);
			list.add(e);
		}
		Iterator<Employee> i = list.iterator();
		System.out.println("ID  FirstName LastName Department");
		while (i.hasNext()) {
			Employee ee = i.next();
			System.out.println(ee.getEmployeeID() + " "
					+ ee.getEmployeeFirstName() + " "
					+ ee.getEmployeeLastName() + " " + ee.getDepartmentName());

		}
	}

}
