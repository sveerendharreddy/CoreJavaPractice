package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double age;
	public Employee(int id, String name, double age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getAge() {
		return age;
	}
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}
	
	
	
	
	
}
public class ComparableTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(2,"chandu",21.5);
		Employee e2 = new Employee(1,"ajay",21.5);
		Employee e3 = new Employee(4,"danu",21.5);
		Employee e4 = new Employee(3,"bindu",21.5);
		
		List<Employee> list =  new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);
		
		for(Employee localEmp:list) {
			System.out.println(localEmp.getId()+" "+localEmp.getName()+" "+localEmp.getAge());
		}
		
		
		
	}

}
