package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeAgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}

	
	
}

class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id==o2.id)
			return 0;
		else if(o1.id>o2.id)
			return 1;
		else
			return -1;
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(2, "chandu", 31.5);
		Employee e2 = new Employee(1, "ajay", 17.5);
		Employee e3 = new Employee(4, "danu", 24.8);
		Employee e4 = new Employee(3, "bindu", 20.5);
		Employee e5 = new Employee(4, "abhi", 24.9);

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		
	//	Collections.sort(list);
		Collections.sort(list, new EmployeeAgeComparator());
		Collections.sort(list, new EmployeeIdComparator());
	

		for (Employee localEmp : list) {
			System.out.println(localEmp.getId() + " " + localEmp.getName() + " " + localEmp.getAge());
		}
	}

}
