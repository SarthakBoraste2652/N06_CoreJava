package org.tnsif.statickeyword;

class Employee
{
	private int employeeId;
	private String empName;
	private static String companyName="TNSIF";
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	public void display()
	{
		System.out.println("EmpID: "+this.getEmployeeId()+" "+"Emp Name: "+
	this.getEmpName()+" "+"Company Name: "+this.getCompanyName()+" ");
	}
	/* As toString method is override method and it can't
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + "]";
	}
	*/
	
	
}

//Driver class
public class StaticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeId(1);
		e.setEmpName("Sarthak");
		e.display();
		
		Employee f = new Employee();
		f.setEmployeeId(2);
		f.setEmpName("Chaitanya");
		f.display();

	}

}
