package strivers.a2z.math;

public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        int reverse = 0;
        int tempInput = x;
        boolean result = false;
        while(tempInput > 0){
            int digit = tempInput % 10;
            reverse = reverse*10 + digit;
            tempInput /= 10;
        }
        if(x == tempInput){
            result = true;
        }
        return result;
    }
}
