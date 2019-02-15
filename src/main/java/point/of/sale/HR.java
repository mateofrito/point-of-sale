package point.of.sale;

import java.util.HashMap;

public class HR {
	
	private HashMap<Integer, Employee> empTable = new HashMap<Integer, Employee>();
	
	public Employee getEmployeeID(int empID) {
		return empTable.get(empID);
	}
	
	public HashMap<Integer, Employee> getEmployees() {
		return empTable;
		
		
	}
	
	public int getNumofEmployees() {
		return empTable.size();
	}
	
	public void addEmployee(Employee newEmp) {
		empTable.put(newEmp.employeeID(), newEmp);
	}
	
	
	
	

}
