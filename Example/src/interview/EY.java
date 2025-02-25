package interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EY {
    public static void main(String[] args) {
        // sum of all even numbers
        List<Integer> input = Arrays.asList(2,2,3,4);
        List<Integer> collect = input.stream().distinct().collect(Collectors.toList());
        System.out.println(input.stream().filter(i -> i%2 == 0).reduce(0, (a, b) -> a+b).intValue());
        System.out.println(input.stream().filter(i -> i%2 == 0).mapToInt(Integer::intValue).sum());

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).filter(i -> i%2 == 0).sum();

        // Print Duplicates in array Java8 way
        input.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        // Print Duplicates in array
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num:input){
            if(map.containsKey(num)){
                Integer integer = map.get(num);
                map.put(num, ++integer);
            }else{
                map.put(num, 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        if(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            if(next.getValue() > 1){
                System.out.println(next.getKey());
            }
        }

    }
}
