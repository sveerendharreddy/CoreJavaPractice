package interview;


import java.util.*;
import java.util.stream.Collectors;

public class Parking {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5).stream().filter(e -> e%2 !=0).map(e -> e*e).reduce((a, b) -> a+b).get());

        Student student = (a,b) -> a+b;
        System.out.println(student.sum(2,5));

        Parking p1= null;
        Optional<Parking> optionals = Optional.ofNullable(p1);
        if(optionals.isPresent()){
            optionals.get().getId();
        }

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,6,7);

        System.out.println(list1.stream().filter(e -> !list2.contains(e)).collect(Collectors.toList()));

        //1,2,3,4,5,1,3
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> input = Arrays.asList(1,2,3,4,5,1,3);
        for(int i:input){
            if(map.containsKey(i)){
                int count = map.get(i);
                map.put(i,++count);
            }else{
                map.put(i,1);
            }
        }

        for(int i:map.keySet()){
            if(map.get(i) == 1 )
                System.out.println(i);
        }

        /*for(int i=1;i<map.size();i++){
            if(map.get())
        }*/
        /*Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            iterator
        }*/



    }
}

@FunctionalInterface
interface Student{
    public abstract int sum(int a, int b);
}

class Employee{
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Singleton{
    static Singleton getInstance;

    private Singleton(){

    }

    public static Singleton getObject(){
        if(getInstance == null)
            getInstance = new Singleton();
        return getInstance;
    }
}
