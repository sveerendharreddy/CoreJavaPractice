package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    //abb abb bab bba bab bba

    public static void main(String[] args) {
       /* String name = "veerendhar";
        String[] sArray = name.split("");
        List<String> stringList = Arrays.asList(sArray);
        List<String> result = stringList.stream().distinct().collect(Collectors.toList());
        System.out.println(result.get(0));*/

        List<Integer> numbersList =  Arrays.asList(1,2,3);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(500);
        numbers.add(100);

        List<String> list = Arrays.asList("3", "6", "8",
                "14", "15");

        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        list.stream().mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

       /* System.out.println(numbers.stream().mapToInt(i -> i*i).filter(i -> i>10000).average().getAsDouble());
        list.stream().filter(s -> s.getAge()> 20).foreach(s::Name);*/


    }
}
