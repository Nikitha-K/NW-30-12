package nikitha;

public class Employee {
	protected int Empcode;
	protected String Empname;
	protected double Salary;
	
	public int getEmpcode() {
		return Empcode;
	}
	public void setEmpcode(int empcode) {
		Empcode = empcode;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Employee(int empcode, String empname, double salary) {
		super();
		Empcode = empcode;
		Empname = empname;
		Salary = salary;
	}
	

}
