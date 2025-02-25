package interview;

import java.util.Arrays;

public class GlobalLogicR1 {
    public static void main(String[] args) {
        //Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11], K = 3
        //Output: 3, 2, 1, 6, 5, 4, 9, 8, 7, 11, 10
        int[] arrInput = {1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11};
       /* interchange(arrInput, 0 ,2);
        interchange(arrInput, 3 ,5);
        interchange(arrInput, 6 ,8);
        interchange(arrInput, 9 ,10);*/
        int k = 3;
        int startIndex = 0;
        int endIndex = k;
        int times = arrInput.length / k;
        int rem = arrInput.length % k;
        for(int i = 1; i <= times; i++){
            interchange(arrInput, startIndex, endIndex-1);
            startIndex = startIndex + k;
            endIndex = endIndex + k;
        }

        if (rem != 0){
            interchange(arrInput, startIndex, endIndex-1);
        }

        Arrays.asList(arrInput).forEach(i -> System.out.print(i+" "));
    }

    //0 2
    static void interchange(int[] arrInput, int startIndex, int endIndex){
        int mid = (endIndex+startIndex)/2;
        for(int i = startIndex; i <= mid; i++){
            int temp = arrInput[i];
            arrInput[i] = arrInput[endIndex];
            arrInput[endIndex] = temp;
            endIndex--;
        }
    }
}
