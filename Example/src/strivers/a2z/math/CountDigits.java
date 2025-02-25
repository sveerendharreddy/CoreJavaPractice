package strivers.a2z.math;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println(evenlyDivides(20));
    }

    static int evenlyDivides(int n) {
        int count = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp%10;
            temp = temp/10;
            if(digit > 0){
                if(n%digit == 0) count++;
            }
        }
        return count;
    }
}
