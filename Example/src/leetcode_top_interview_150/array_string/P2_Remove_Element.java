package leetcode_top_interview_150.array_string;

import java.util.HashSet;
import java.util.Set;

public class P2_Remove_Element {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));


        Set<Integer> set = new HashSet<>();
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Initialize a counter for elements not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
