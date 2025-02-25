package streams;


import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ajay","Aashwin","banu","ajay");

        //String starts with letter a
        System.out.println(list.stream().filter(s -> s.startsWith("a") || s.startsWith("A")).collect(Collectors.toList()));

        // find out all the even numbers exist in the list
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println(myList.stream().filter(i -> i%2==0).collect(Collectors.toList()));

        // find out all the numbers starting with 1
        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println(myList1.stream().map(i -> i + "").filter(i -> i.startsWith("1")).collect(Collectors.toList()));

        //find duplicate elements in a given integers list
        List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        System.out.println(myList2.stream().filter(i -> !set.add(i)).collect(Collectors.toSet()));

        // find the first element of the list using Stream functions
        List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList3.stream().findFirst().get());

        //find the total number of elements present in the list
        List<Integer> myList4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList4.stream().count());

        // find the maximum value element present in it using Stream functions
        List<Integer> myList5 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList5.stream().max(Integer::compareTo).get());

        //find the first non-repeated character in it using Stream functions?
        String input = "Java Hungry Blog Alive is Awesome";
        Map<String, Integer> occurenceMap = new LinkedHashMap <>();
        /*Arrays.asList(input.split(""))
                .stream().map(s -> {
                    if(occurenceMap.containsKey(s)){
                        occurenceMap.put(s,occurenceMap.get(s)+1);
                    }else{
                        occurenceMap.put(s,1);
                    }
                    return s;
                })*/
        List<String> strings = Arrays.asList(input.split(""));
        String s1 = strings.stream()
                .filter(s -> Collections.frequency(strings, s) == 1).findFirst().get();
        System.out.println("First Non repeated char "+s1);
    }
}
