package interview;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/***
 * push(int x) -> push to stack
 * pop() -> pop element from stack
 */
public class Smarsh {
    static LinkedList<Integer> list = new LinkedList<>();

    static int max;


    public static void main(String[] args) {
        Smarsh.push(1);
        Smarsh.push(25);
        Smarsh.push(29);
        Smarsh.pop();
        System.out.println(Smarsh.peekMax());
    }

    public static void push(int x){
        if(x > max){
            max = x;
        }
        list.push(x);
    }

    public static int pop(){
        return list.remove(1);
    }

    public static int peekMax(){
        /*list.stream().sorted(Comparator.reverseOrder()).findFirst();*/
        return max;
    }
}




