package leetcode_top_interview_150.array_string;

import java.util.HashMap;
import java.util.Map;

public class P6_RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("I",1);
        valueMap.put("V",5);
        valueMap.put("X",10);
        valueMap.put("L",50);
        valueMap.put("C",100);
        valueMap.put("D",500);
        valueMap.put("M",1000);

        String[] input = s.split("");
        int result = 0;
        for(int i = 0;i < input.length; i++){
            if(i < input.length -1 &&
                valueMap.get(input[i]) < valueMap.get(input[i+1])){
                result+= valueMap.get(input[i+1]) - valueMap.get(input[i]);
                i = i+1;
            }else {
                result+= valueMap.get(input[i]);
            }
        }
        return result;
    }
}
