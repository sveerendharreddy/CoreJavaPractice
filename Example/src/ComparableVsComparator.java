import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableVsComparator {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(2,"Bavisha",21.3f));
        list.add(new Employee(5,"Bavisha",17.3f));
        list.add(new Employee(1,"Ajay",22.3f));
        list.add(new Employee(4,"Carmi",20.3f));
        list.add(new Employee(3,"David",25.3f));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,new NameComparator());
        System.out.println(list);

        for(Employee s:list){

        }
    }
}

class Employee implements Comparable{
    int id;
    String name;
    float age;

    public Employee(int id,String name,float age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int id1 = this.id;
        Employee e = (Employee)o;
        int id2 = e.id;

        if(id1 < id2)
            return -1;
        else if (id1 > id2)
            return 1;
        else
            return 0;
    }
}

class NameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.name.compareTo(o2.name);
        if(res == 0){
            float age1 = o1.age;
            float age2 = o2.age;
            if(age1 < age2)
                return -1;
            else if (age1 >age2) {
                return 1;
            }else
                return 0;
        }
        return res;
    }
}
