
import java.util.*;  
public class LambdaExpressionExample7{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (variable)->System.out.println(variable)  
        );  
        
        for(String s:list) {
        	System.out.println(s);
        }
    }  
}  