package interview;

import java.util.*;
import java.util.stream.Collectors;

public class EYRound2 {
/*
    public static void main(String[] args) {
        //[12:07 PM] Aditya Pattnaik
        //Map<Employee,Department> empDetails = new HashMap<>();
        //
        //Employee:
        //
        //Id, Name, Salary
        //
        //Department:
        //
        //Id, Name
        //
        //Return employee names in each department
        //Q2 Store Unique Employees - Set
        //Q3 Store Unique Employees based on Employee id, then id + Name combination

        //
        EYRound2 EYRound2 = new EYRound2();
        Department d1 = EYRound2.createDepertment(1, "Engineering");
        Department d2 = EYRound2.createDepertment(1, "Devops");

        Employee ashish = EYRound2.createEmployee(1, "ashish", "21");
        Employee ashish1 = EYRound2.createEmployee(1, "ashish1", "25");

        Employee bindu = EYRound2.createEmployee(2, "bindu", "22");
        Employee chandu = EYRound2.createEmployee(3, "chandu", "24");
        Employee chandu1 = EYRound2.createEmployee(3, "chandu", "24");

        Map<Str, Employee> map = new HashMap<>();
        map.put(ashish.getId()+ashish.getName(), ashish);
        map.put(ashish.getId()+ashish.getName(), ashish1);

        map.entrySet().forEach(s -> System.out.println());


        HashMap<Employee,Department> empDetails = new HashMap<>();
        empDetails.put(ashish, d1);
        empDetails.put(bindu, d1);
        empDetails.put(chandu, d2);

        empDetails.entrySet()
                .stream().collect(Collectors.groupingBy(empDetails::))

        */
/*Map<String, List<String>> result;
        empDetails.entrySet()
                .stream().map((R, V ) -> {

                })*//*


        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(ashish);
        employeeSet.add(ashish1);

        employeeSet.stream()
                .sorted(Comparator.comparing(Employee::getId, Comparator.reverseOrder())).forEach();

        employeeSet.stream()
                .sorted()


    }
*/

    Employee createEmployee(int id, String name, String salary){
        return new Employee(id, name, salary);
    }

    Department createDepertment(int id, String name){
        return new Department(id,name);
    }

    class Department{
        int id;
        String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Department(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    class Employee {
        int id;
        String name;
        String salary;

        /*@Override
        public boolean equals(Object obj) {
             Employee e = (Employee) obj;
             e.getId() > this.getId() ? 1 : 0;
        }*/

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSalary() {
            return salary;
        }

        public void setSalary(String salary) {
            this.salary = salary;
        }

        public Employee(int id, String name, String salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }


}
