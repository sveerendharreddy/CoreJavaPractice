package dynamic_programming;

public class ClimbingStairs {
    static int n1=0, n2=1, n3=0, sum=0;
    public static void main(String[] args) {
        int n =10;
       // fibonacci(n);

        System.out.print(0 + " "+ 1);
        fibonacciRecursion(n-2);
        System.out.println("sum is" +sum);

        System.out.println(fibonacciDP(10));

    }

    public static int fibonacciDP(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void fibonacciRecursion(int n){
        if(n > 0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            sum+= n3;
            System.out.print(" "+n3);
            fibonacciRecursion(n-1);
        }
    }

    public static void fibonacci(int n){
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " "+ n2);
        for (int i = 1; i < n; i++){
            int sum = n1 + n2;
            System.out.print(" " + sum+ " ");
            n1 = n2;
            n2 = sum;
        }
    }

    public int climbStairs(int n) {
        return 0;
    }
}
