package interview;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BYR1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,1,4,3,2);
        list.stream().sorted((l1,l2) -> l2.compareTo(l1)).forEach(System.out::println);

        // Types of IOC
        // Configurable properties


       /* list.stream().distinct().forEach(l -> System.out.println(l));
        list.stream().forEach(l -> {
            if (freq.containsKey(l)){
                Integer integer = freq.get(l);
                freq.put(l, integer++);
            }else {
                freq.put(l, 1);
            }
        });
        Stream.of(freq).filter(freq ->
        {
            freq.
        })*/
    }
}
