package interview;



import java.util.Arrays;
import java.util.List;

public class Zensar {
    public static void main(String[] args) {
        String s = "Zensar/`$%";
        Arrays.stream(s.split("")).map(e -> e.toUpperCase()).
                filter(e -> e.equals(e.toLowerCase())).forEach(System.out::println);


        System.out.println(check2Shift("abcd",2).equals("cdab"));
        /*String input
                input = abcd
                output = cdab*/




    }

    static String check2Shift(String input,int shift){
        List<String> list = Arrays.asList(input.split(""));
        for(int i=0;i<=shift;i++){
            String first = list.get(i);
            list.remove(first);
            list.add(first);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String s:list){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
