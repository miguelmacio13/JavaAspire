package aspirejavacourse.aspire;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1207,"Angel","HR","miguelmacio13@gmail.com");
		
		Employee employee1 = new Employee();
		
		employee1.setEmployeeId(1208);
		employee1.setDepartmentName("Training");
		employee1.setEmployeeName("Miguel");
		employee1.setEmailID("miguel.macias@aspiresys.com");
		
		System.out.println("employee ID: " + employee1.getEmployeeId());
		System.out.println("employee name: " + employee1.getEmployeeName());
		System.out.println("employee email: " + employee1.getEmailID());
		System.out.println("employee Department: " + employee1.getDepartmentName());
		
		System.out.println("employee ID: " + employee.getEmployeeId());
		System.out.println("employee name: " + employee.getEmployeeName());
		System.out.println("employee email: " + employee.getEmailID());
		System.out.println("employee Department: " + employee.getDepartmentName());
	}

}
