package interview;

import java.util.*;
import java.util.stream.Collectors;

public class Coforge {
    public static void main(String[] args) {

        Employeee e1 = new Employeee(1,"ajay1",2000);
        Employeee e2 = new Employeee(2,"ajay2",3000);
        Employeee e3 = new Employeee(3,"ajay3",5000);
        Employeee e4 = new Employeee(4,"ajay4",4000);
        Employeee e5 = new Employeee(5,"ajay5",6000);
        Employeee e6 = new Employeee(6,"ajay6",7000);

        List<Employeee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);

        Employeee employeee = list.stream().sorted(Comparator.comparing(Employeee::getSalary)).skip(2).findFirst().get();
        System.out.println(employeee);

        Map<Integer,Employeee> map = new HashMap<>();
        map.put(1,e1);
        map.put(2,e2);
        map.put(3,e3);
        map.put(4,e4);
        map.put(5,e5);
        map.put(6,e6);

        System.out.println(map.values().stream().filter(e -> e.getSalary() > 4000).collect(Collectors.toList()));

        String name = "veerendhar";
        List<String> strings = Arrays.asList(name.split(""));

        List<String> listOfAplha = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

        System.out.println(listOfAplha.stream().filter(e -> !strings.contains(e)).collect(Collectors.toList()));

       /* System.out.println(strings.stream().peek(e -> {
            if(listOfAplha.contains(e))
                listOfAplha.remove(e);
        }).collect(Collectors.toList()));*/


    }

}

class Employeee{
    int id;
    String name;
    float salary;

    public Employeee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

/*class SalaryComparator implements Comparator<Employeee>{

    @Override
    public int compare(Employeee o1, Employeee o2) {
        if
        return 0;
    }
}*/
