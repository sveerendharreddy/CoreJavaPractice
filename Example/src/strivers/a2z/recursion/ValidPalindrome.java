package strivers.a2z.recursion;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        //Convert to lowercase and remove non-alphanumeric characters
        StringBuilder input = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                input.append(Character.toLowerCase(c));
            }
        }
        char[] chars = input.toString().toCharArray();
        return isPalindromeReverse(chars, 0, chars);
    }

    boolean isPalindromeReverse(char arr[], int startIndex, int endIndex){
       if(startIndex < endIndex){
           if (arr[startIndex] == arr[endIndex]){
               startIndex++;
               endIndex--;
               isPalindromeReverse(arr, startIndex, endIndex);
           }else return false;
       }
       return true;
    }
}
