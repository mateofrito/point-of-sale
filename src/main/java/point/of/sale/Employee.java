package point.of.sale;




public class Employee {
	
	private int empID;
	private String empName;
	private long payRate;
	

	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
		
		
	}


	public Integer employeeID() {
		return empID;
	}

}
