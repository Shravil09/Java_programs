package Encapsulation;

public class Employee {
	private int empId;
	private String empName;
	
	public void setEmpId(int eId) {
		empId = eId;
	}
	public void setEmpName(String eName) {
		empName = eName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Shravil Bhagwat");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
	}

}
