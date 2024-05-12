package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ibm {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","150","75","5");
        list.stream().mapToInt(Integer::valueOf).filter(i -> i!=75).sorted().forEach(System.out::println);


        /*String input = "veerendhar";
        Map<String, Integer> map= new HashMap<>();
        Arrays.asList(input.split("")).stream().map(e -> {
            if(map.containsKey(e)){
                int val = map.get(e);
                map.put(e,++val);
            }else {
                map.put(e,1);
            }
        });*/
    }
}
