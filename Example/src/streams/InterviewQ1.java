package streams;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewQ1 {
    public static void main(String[] args) {
        // sum of all even numbers in the list.
        List<Integer> numbers1 = Arrays.asList(1,2,7,8,9,6,3);
        int sum = numbers1.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        // find the second largest number in the list.
        Optional<Integer> secondLargestNumber = numbers1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondLargestNumber.get());

        // average of all the numbers in the list.
        OptionalDouble average = numbers1.stream().mapToInt(Integer::intValue).average();
        System.out.println(average.getAsDouble());

        // product of all numbers in the list.
        int sum1 = numbers1.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product of list :: "+sum1);
        int product = numbers1.stream().reduce(0, (a,b) -> a+b);
        System.out.println("Sum of list :: "+product);

        // Given a list of strings, write a Java 8 Stream program to count the number of strings that contain the letter ‘a’ in the list.
        List<String> str = Arrays.asList("John", "Vincent", "Erwan");
        long charCount = str.stream().filter(s -> s.contains("a")).count();
        System.out.println(charCount);

        //  find the shortest string in the list.
        String shortestString  = str.stream().min(Comparator.comparing(String::length)).get();
        System.out.println("shortest String is:" + shortestString);

        // find the longest string in the list.
        String longestStr = str.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("longest String is:" + longestStr);

        //  find the number of strings that have more than 5 characters.
        long strGreaterThanFive  = str.stream().filter(a -> a.length() > 5).count();
        System.out.println("string count greater than five :" + strGreaterThanFive);

        //  find the oldest person in the list.
        List<Person> persons = Arrays.asList
                (new Person("Emilie", 30), new Person("Benoit", 32),
                        new Person("Alexandre", 23));
        Person person = persons.stream().max(Comparator.comparing(Person::getAge)).get();
        System.out.println(person);

        //find the total salary of all employees over the age of 30
        List<Employee> employees = Arrays.asList(
                new Employee
                        ("59-385-1088","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0, 32),
                new Employee
                        ("73-274-6476","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2, 30),
                new Employee
                        ("85-939-9584","Axe","Gumb","agumb2@twitter.com","Female","FALSE",62291,4, 25),
                new Employee
                        ("08-180-8292","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4, 28),
                new Employee
                        ("21-825-2623","Ulick","Burrel","uburrel4@google.ru","Male","FALSE",128764,5, 40),
                new Employee
                        ("66-708-5539","Tailor","Ridding","Ridding","Female","FALSE",152924,4, 22),
                new Employee
                        ("81-697-2363","Joete","Braybrooke","jbraybrooke6@prnewswire.com","Male","TRUE",128907,0, 45),
                new Employee
                        ("63-019-1110","Elroy","Baverstock","ebaverstock7@ehow.com","Male","TRUE",2510,0, 21)
        );
        int totalSalary  = employees.stream().filter(e -> e.getAge() > 30).mapToInt(Employee::getSalary).sum();
        System.out.println("total salary of emplyee whose age > 30 : " + totalSalary);

    }
}

class Person {

    private String name;
    private int age;


    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Employee {

    private String empId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String newJoiner;
    private int salary;
    private int rating;
    private int age;


    //getter setter and constructor


    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", newJoiner='" + newJoiner + '\'' +
                ", salary=" + salary +
                ", rating=" + rating +
                ", age=" + age +
                '}';
    }

    public Employee(String empId, String firstName, String lastName, String email, String gender, String newJoiner, int salary, int rating, int age) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.newJoiner = newJoiner;
        this.salary = salary;
        this.rating = rating;
        this.age = age;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNewJoiner() {
        return newJoiner;
    }

    public void setNewJoiner(String newJoiner) {
        this.newJoiner = newJoiner;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
