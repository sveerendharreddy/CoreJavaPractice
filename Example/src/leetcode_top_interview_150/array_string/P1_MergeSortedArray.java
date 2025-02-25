package leetcode_top_interview_150.array_string;

import java.util.Arrays;

public class P1_MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num1Temp = Arrays.copyOf(nums1, m);
        int num1Index = 0;
        int num2Index = 0;
        int resultIndex = 0;
        while(resultIndex < m+n && num1Index < m && num2Index < n){
            if(num1Temp[num1Index] <= nums2[num2Index]){
                nums1[resultIndex] = num1Temp[num1Index];
                num1Index++;
            }else{
                nums1[resultIndex] = nums2[num2Index];
                num2Index++;
            }
            resultIndex++;
        }

        // Code Coping Remaining elements in either of Arrays
        if (resultIndex < m+n){
            int[] copyRemaining = null;
            int copyRemainingIndex = 0;
            if (num1Index < m){
                copyRemaining = num1Temp;
                copyRemainingIndex = num1Index;
            } else if (num2Index < n) {
                copyRemaining = nums2;
                copyRemainingIndex = num2Index;

            }
            while (resultIndex < m+n){
                nums1[resultIndex] = copyRemaining[copyRemainingIndex];
                resultIndex++;
                copyRemainingIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] input1 = {1,2,3,0,0,0};
        merge(input1, 3, new int[]{2,5,6}, 3);
        Arrays.stream(input1).forEach(resultIndex -> System.out.print(resultIndex + " "));

        int[] input2 = {0};
        merge(input2, 0, new int[]{1}, 1);
        Arrays.stream(input2).forEach(resultIndex -> System.out.print(resultIndex + " "));
    }
}
