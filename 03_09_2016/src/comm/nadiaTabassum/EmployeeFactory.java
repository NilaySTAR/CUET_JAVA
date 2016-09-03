package comm.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeFactory {
	private Statement statement=null;
	private Connection con=null;
	private ResultSet rs=null;
	private List<Employees> list=null;
	OracleConnection factory=null;
	public EmployeeFactory() {
		super();
		list=new ArrayList<Employees>();
		factory=new OracleConnection();
		
	}
	
	
	public void displayEmployees()throws SQLException
	{
		
		con=factory.getOracleConnection();
		
		//Step-3
		statement=con.createStatement();
		
		//Step-4
		rs=statement.executeQuery("select e.last_name, e.first_name, e.department_ID, d.department_ID, d.department_name from employees e, departments d where e.department_ID=d.department_ID");
		while(rs.next())
		{
			String firstName=rs.getString(2);
			String lastName=rs.getString(1);
			int emplyeeID=rs.getInt(3);
			int departmentID=rs.getInt(4);
			String departmentName=rs.getString(5);
			Employees s=new Employees(departmentID, departmentName, emplyeeID, firstName, lastName);
			//Departments d= new Departments(departmentID, departmentName);
			list.add(s);
		}
		Iterator<Employees> i=list.iterator();
		
		System.out.println("dept ID   dept Name  First Name   Last Name   EmplyeeID\n");
		while(i.hasNext())
		{
			Employees ss=i.next();
			System.out.println(ss.getDepartmentID()+"  "+ss.getDepartmentName()+"  "+ss.getEmployeeFirstName()+" "+ss.getEmplyeeLastName()+" "+ss.getEmployeeID());
		}
}
}
