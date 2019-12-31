//arraylist demonstration using data passed in command line args

package nikitha;
import java.util.ArrayList;


public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"deloitte",4574));
		emplist.add(new Employee(Integer.parseInt(args[0]),(args[1]),Double.parseDouble(args[2])));
		for(Employee emp: emplist)
			System.out.println(emp.getEmpcode()+" "+emp.getEmpname()+" "+emp.getSalary());
		
	}

	

}
