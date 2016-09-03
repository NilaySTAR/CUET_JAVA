package comm.example;

public class Employees extends Departments {
	private int employeeID;
	private String employeeFirstName;
	private String emplyeeLastName;
	//private int departmentID;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public Employees(int departmentID, String departmentName, int employeeID,
			String employeeFirstName, String emplyeeLastName) {
		super(departmentID, departmentName);
		this.employeeID = employeeID;
		this.employeeFirstName = employeeFirstName;
		this.emplyeeLastName = emplyeeLastName;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmplyeeLastName() {
		return emplyeeLastName;
	}
	public void setEmplyeeLastName(String emplyeeLastName) {
		this.emplyeeLastName = emplyeeLastName;
	}
	

}
