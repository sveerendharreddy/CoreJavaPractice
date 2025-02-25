package strivers.a2z.math;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(1534236469));
        /*reverseInteger.reverse(-123);
        reverseInteger.reverse(120);*/
    }

    public int reverse(int x) {
        int result = 0;
        while(x != 0){
            int temp = x%10;
            // Check for overflow before updating reversed
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0; // Positive overflow
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0; // Negative overflow
            }
            result = result*10 + temp;
            x = x/10;
        }
        return result;
    }
}
