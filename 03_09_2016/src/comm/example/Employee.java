package comm.example;

public class Employee {
	private int employeeID;
	private String employeeLastName;
	private String employeeFirstName;
	private String departmentName;

	public Employee() {
		super();
	}

	public Employee(int employeeID, String employeeLastName,
			String employeeFirstName,String departmentName) {
		super();
		this.employeeID = employeeID;
		this.employeeLastName = employeeLastName;
		this.employeeFirstName = employeeFirstName;
		this.departmentName=departmentName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

}
