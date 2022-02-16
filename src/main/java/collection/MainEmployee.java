package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setFirstName("john");
		emp1.setLastName("last");
		emp1.setId(1);
		empList.add(emp1);
		/*Employee emp2 = new Employee();
		emp2.setFirstName("john");
		emp2.setLastName("last");
		emp2.setId(1);
		empList.add(emp2);*/
		System.out.println("Before set values...............");
		for (Employee employee : empList) {
			System.out.println(employee.getFirstName());
        	System.out.println(employee.getLastName());
        	System.out.println(employee.getId());
		}
		 
		Set<Employee> set = new HashSet<Employee>(empList);

		 System.out.println("Set values ....................");
	        for (Employee temp : set){
	        	System.out.println(temp.getFirstName());
	        	System.out.println(temp.getLastName());
	        	System.out.println(temp.getId());
	        }
	        
	   List<String> value = new ArrayList<String>();
	   value.add("john");
	   value.add("paul");
	   value.add("test");
	   Set<String> empValue = new HashSet<String>();
	   empValue.addAll(value);
	   
	   for (String string : empValue) {
		System.out.println("set values are:  "+string);
	}
	   System.out.println("------------------------------");
	   value.remove(0);
	   
	   for (String string : value) {
		System.out.println("list values are: "+string);
	}
	   System.out.println("------------------------------");
	   for (String string : empValue) {
			System.out.println("set values are:  "+string);
		}
		//emp1.
		//boolean equals = emp1.equals(emp2);
	//	System.out.println(equals+" equals value");
		//empList.add(emp1);
		
		
	}
}
