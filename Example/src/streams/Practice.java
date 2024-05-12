package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        // 01 - Print Sum Of All Numbers
        List<Integer> list = Arrays.asList(1,3,4,6,92 ,23,21,3);
        Optional<Integer> sum = list.stream().
                reduce((a, b) -> a+b);
        if(sum.isPresent())
            System.out.println(sum.get());

        // 02 - Print Avg Of All Numbers
        double avg = list.stream()
                .mapToInt(i -> i).
                average().
                getAsDouble();
        System.out.println(avg);

        // 03 - Square, Filter and Average of Numbers
        double avg1 =list.stream().mapToInt(i -> i*i).filter(i -> i>20).average().getAsDouble();
        System.out.println(avg1);

        // 04 - Print Even & Odd Numbers using Streams
        System.out.println(list.stream().filter(e -> e%2 ==0).collect(Collectors.toList()));
        System.out.println(list.stream().filter(e -> e%2 !=0).collect(Collectors.toList()));

        //  05 - Print Numbers Starts With Prefix 2 using Streams
        List<Integer> collect = list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(collect);

        // 06 - Print Duplicate Numbers using Streams
        System.out.println(list.stream().filter(e -> Collections.frequency(list,e) > 1).collect(Collectors.toSet()));

        Set<Integer> dupSet = new HashSet<>();
        System.out.println(list.stream().filter(e -> !dupSet.add(e)).collect(Collectors.toSet()));

        //  07 - Find Max and Min Numbers using Streams
        System.out.println(list.stream().max(Integer::compare).get());
        System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println(list.stream().min(Integer::compare).get());

        // 08 - Sort Numbers (ASC/DESC) using Streams
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        // 09 - Get/ignore first 2 numbers using Limit & Skip in Streams
        System.out.println(list.stream().limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().limit(2).reduce((p,q) -> p+q).get());

        System.out.println(list.stream().skip(6).reduce((p,q) -> p+q).get());

        // 10 - Get Second Highest/Lowest Number using Streams
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get());
        System.out.println(list.stream().sorted().distinct().skip(1).findFirst().get());

        // 11 - first Not Repeated character
        String input = "Java Hungry Blog Alive is Awesome";
        Set<String> set = new LinkedHashSet<>();
        List<String> strings = Arrays.asList(input.split(""));
        System.out.println(strings.stream().filter(e -> Collections.frequency(strings,e) == 1).filter(e -> set.add(e)).findFirst().get());

        Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        Arrays.asList(input.split(""));

        // 12 - first Repeated character
        System.out.println(strings.stream().filter(e -> Collections.frequency(strings,e) > 1).filter(e -> set.add(e)).findFirst().get());

        Character result1 = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result1);


    }
}
