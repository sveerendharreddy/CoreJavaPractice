package strivers.a2z.math;

public class SumOfDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(1));
    }

    public static int sumOfDivisors(int n) {
        int temp = n;
        int sum = 0;
        for(int i = 1; i <= temp; i++){
            int result = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0)
                    result += j;
            }
            sum += result;
        }
        return sum;
    }
}
