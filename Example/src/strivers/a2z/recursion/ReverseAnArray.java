package strivers.a2z.recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        ReverseAnArray reverseAnArray = new ReverseAnArray();
        int[] input = new int[]{1, 4, 3, 2, 6, 5};
        reverseAnArray.reverseArray(input);
        System.out.print(Arrays.toString(input));
    }

    public void reverseArray(int arr[]) {
        reverseArrayRecursive(arr, 0, arr.length-1);
    }

    void reverseArrayRecursive(int arr[], int startInderx, int endIndex){
        if(startInderx < endIndex){
            int temp = arr[startInderx];
            arr[startInderx] = arr[endIndex];
            arr[endIndex] = temp;
            startInderx++;
            endIndex--;
            reverseArrayRecursive(arr, startInderx, endIndex);
        }else return;

    }
}
