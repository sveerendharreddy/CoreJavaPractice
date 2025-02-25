package array;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] leftRotate =  rotateArrayLeft(new int[]{1,2,3,4,5}, 2, 5);
        Arrays.stream(leftRotate).forEach(i -> System.out.print(i + " "));
    }

    static int[] rotateArrayLeft(int arr[], int d, int n) {
        int[] reversedFirstArray = reverseArray(arr, 0, d-1);
        int[] reversedLastArray = reverseArray(reversedFirstArray, d, n-1);
        return reverseArray(reversedLastArray, 0, n-1);
    }

    public static int[] reverseArray(int targetArray[], int startIndex, int endIndex){
        while (startIndex < endIndex){
            int temp = targetArray[startIndex];
            targetArray[startIndex] = targetArray[endIndex];
            targetArray[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return targetArray;
    }
}
