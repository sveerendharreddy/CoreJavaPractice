package strivers.a2z.math;

import java.util.Arrays;

public class LCMAndGCD {
    public static void main(String[] args) {
        int[] result = lcmAndGcd(1,1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] lcmAndGcd(int a, int b) {
        int gcd = findGcd(a,b);
        int lcm = a*b / gcd;
        return new int[]{lcm,gcd};
    }

    public static int findGcd(int a, int b){
        if (a%b == 0)
            return b;
        else
            return findGcd(b, a%b);
    }
}
