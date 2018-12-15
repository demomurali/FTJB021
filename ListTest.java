package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Employee;

public class ListTest {

	public static void main(String[] args) {
		
		// collection framework
		// unified arch
		// data / structure 1,2,4,6,8
		// array , hash, tree
		// list, set and map
		// ArrayList, HashSet and TreeMap
		// hold and iterate
		

		Employee sureshEmployee=new Employee();
		Employee rameshEmployee=new Employee();
		Employee dhineshEmployee=new Employee();
		
		List <Employee>employeeList=new ArrayList<Employee>();
		dhineshEmployee=rameshEmployee;
		
		
		
		rameshEmployee.setDepartment("developer");
		rameshEmployee.setName("ramesh kumar");
		rameshEmployee.setEmployeeId(1001);
		
		sureshEmployee.setEmployeeId(1002);
		sureshEmployee.setName("suresh kumar");
		
		employeeList.add(sureshEmployee);
		employeeList.add(dhineshEmployee);
		employeeList.add(rameshEmployee);
		System.out.println(employeeList);
		
		for(int i=0;i<employeeList.size();i++){
			System.out.println(employeeList.get(i).getEmployeeId());
		}
	
		Iterator iterator=employeeList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		for(Employee e:employeeList){
			System.out.println(e.getEmployeeId());
		}
		
		
		
		
		
		
		
		
		// structure /skelton/ frame + work
		// 
		
		
		
		
		
		//System.out.println(Integer.toHexString(rameshEmployee.hashCode()));
		//System.out.println(rameshEmployee == sureshEmployee);
		//System.out.println(rameshEmployee == dhineshEmployee);
		System.out.println(rameshEmployee.equals(sureshEmployee));
		
		
		
		
		
		// content 
		
	//	System.out.println(rameshEmployee.toString().hashCode());
		//System.out.println(sureshEmployee.hashCode());
		//System.out.println(dhineshEmployee.hashCode());
		
		

	}

}
