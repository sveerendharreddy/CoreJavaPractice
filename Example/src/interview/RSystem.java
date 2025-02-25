package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RSystem {
    public static void main(String[] args) {
        Emp emp1 = new Emp(1, "aaa", Arrays.asList("123","1234"));
        Emp emp2 = new Emp(2, "bbb", Arrays.asList("1233"));

        List<Emp> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);

        List<String> list = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(list);

        List<String> phoneNumberList = empList.stream().flatMap(emp -> emp.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumberList);
    }
}

class Emp{
    int id;
    String name;
    List<String> phoneNumbers;

    public Emp(int id, String name, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

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

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
