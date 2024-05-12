package interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aeries {
    public static void main(String[] args) {
        /*List<Integer> input = Arrays.asList(2,5,3,-6,0,9,12,4);
        System.out.println(input.stream().sorted().collect(Collectors.toList()));*/

        String inputEasy = "{{[)(]}}";

        String inputHard = "{{}{}{[][][]{}{}{[]{}()()()";

        List<String> openBrace = Arrays.asList("{","[","(");
        List<String> closedBrace = Arrays.asList("}","]",")");

        Stack<String> stack = new Stack<>();
        String[] inputArray = inputEasy.split("");
        for (String s:inputArray){
            if(openBrace.contains(s)){
                stack.push(s);
            } else if (closedBrace.contains(s)) {
                    stack.pop();
            }
        }

        if (stack.size() == 0)
            System.out.println("Valid Parenthesis");
        else
            System.out.println("Not Valid Parenthesis");

    }
}
