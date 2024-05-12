package interview;

import java.util.*;

/***
 * Program to find the frequency of each element of an ArrayList?
 */
public class Monjin {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","a","c");

        Map<String, Integer> map = new HashMap<>();

        for (String s:list){
            if(map.containsKey(s)){
                int value = map.get(s);
                map.put(s,++value);
            }else{
                map.put(s,1);
            }
        }

        Set<String> strings = map.keySet();
        for(String key :strings){
            System.out.println("Frequency of String ::" +key +" is :: "+map.get(key));
        }
    }


}
