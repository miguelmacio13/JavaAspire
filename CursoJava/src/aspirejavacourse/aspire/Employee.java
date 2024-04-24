package aspirejavacourse.aspire;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String emailID;
	private String departmentName;
	
	
	//Constructor method
	public Employee(int employeeId, String employeeName, String emailId, String departmentName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailID = emailId;
		this.departmentName = departmentName;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
