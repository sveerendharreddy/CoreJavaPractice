package interview;

import java.util.ArrayList;
import java.util.List;

public class CopperPodR1 {
    public static void main(String[] args) {
        /*
        "This is a Java Interview". Reverse this String word by Word. Output should be : "Interview Java a is This"
         */
        String s = "This is a Java Interview";
        String[] sArray = s.split(" ");
        for(int i=sArray.length-1; i >= 0; i--){
            System.out.print(sArray[i]+ " ");
        }

        List<Employee> empList = new ArrayList<>();
       /* empList.add()

        empList.stream.filter(emp -> emp.getAge() > 40).foreach(emp -> sout(emp.getNmase()));

        empList.stream.filter(emp -> emp.getAge() > 40).collect(emp::GetAge)*/

    }

    class Employee{

        private int id;

        private String name;

        private String age;

    }



    /*
    [11:20 AM] Syed Sabiyullah


class Employee{

private int id;

private String name;

private String age;

}
[11:20 AM] Syed Sabiyullah
List<Employee> empList;
     */
}
