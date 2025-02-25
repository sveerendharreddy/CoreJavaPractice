package interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoforgeR1 {
    public static void main(String[] args) {
        //Input 1,2,3,4,1,2,3,2,3,3
        // Output element in decending order of there frequencies
        // Frontend Questions need to read
        // @Spring boot application
        //@Primary and Qualifier
        //Future and completable future
        //Angular Questions
        List<Integer> inputList = Arrays.asList(1,2,3,4,1,2,3,2,3,3);
        Map<Integer, Integer> map = new HashMap<>();
        for (int input:inputList){
            if (map.containsKey(input)){
                Integer integer = map.get(input);
                map.put(input, integer++);
            }else {
                map.put(input, 1);
            }
        }
       // Stream.of(map).sorted(Comparator.comparingInt(map::get))
    }
}
