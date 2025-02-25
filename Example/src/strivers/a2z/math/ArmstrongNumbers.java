package strivers.a2z.math;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
        System.out.println(armstrongNumber(372));
        System.out.println(armstrongNumber(100));

    }

    static boolean armstrongNumber(int n) {
        int result = 0;
        int temp = n;
        while(temp > 0){
            result = (int) (result + Math.pow(temp % 10, 3));
            temp /= 10;
        }
        if(n == result)
            return true;
        else
            return false;
    }
}
