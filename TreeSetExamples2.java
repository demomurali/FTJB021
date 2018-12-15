package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import catchDemo.Account;
import model.Employee;

public class TreeSetExamples2 {


public static void main(String[] args) {
		
	Employee sureshEmployee=new Employee();
	Employee rameshEmployee=new Employee();
	Employee dhineshEmployee=new Employee();
	
	rameshEmployee.setDepartment("developer");
	rameshEmployee.setName("ramesh kumar");
	rameshEmployee.setEmployeeId(1001);
	
	dhineshEmployee.setEmployeeId(1003);
	dhineshEmployee.setName("dhinesh kumar");
	
	sureshEmployee.setEmployeeId(1001);
	sureshEmployee.setName("suresh kumar");
	
	Set<Employee> employeeSet=new TreeSet<Employee>();
		
	employeeSet.add(sureshEmployee);
		employeeSet.add(dhineshEmployee);
	employeeSet.add(rameshEmployee);
	
		//System.out.println(ids);
		
		for(Employee value:employeeSet){
			System.out.println(value);
		}
}

}
