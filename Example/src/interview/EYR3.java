package interview;

import java.util.Comparator;

public class EYR3 {
    public static void main(String[] args) {
        //Inputmap-
        //A,5
        //B,2
        //D,1
        //C,8
        //
        //Outputmap-
        //D,1
        //B,2
        //A,5
        //C,8

       // map.stream().sort(Comparator(map::getValue))

        //Elements= 2,4,3,8,5

        //Sum = 7

        /*
        ID, Name, Salary, MgrID

1,A,600,3
2,B,500,4
3,C,200,null
4,D,900,null


EmployeeList




select a.Name from EmployeeList a, EmployeeList b  where a.salary >  b.salary and a.MgrID = b.ID;

select name from EmployeeList order By Salary desc limit 4 top 3;
         */



    }
}
