package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstSource {
    public static void main(String[] args) {
        /*int input = 6;
        int sum=0;
        sum = (input*(input +1))/2;
        System.out.println("Sum is ::" +sum);*/

        Map<Integer,Boolean> doors = new LinkedHashMap<>();
        for(int i=1;i<=100;i++){
            doors.put(i,false);
        }

        //Persons
        for(int i=1;i<=100;i++){
            //Doors
            for (int j=1;j<=100;j++){
                if(j%i == 0){
                    boolean status = doors.get(j);
                     doors.put(j,!status);
                }
            }
        }

        int openedDoor =0;
        for(int i=1;i<=doors.size();i++){
            if(doors.get(i).equals(true))
                openedDoor++;
        }
        System.out.println(openedDoor);
    }
}
