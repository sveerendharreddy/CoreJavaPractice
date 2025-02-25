package strivers.blind75.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] input1 = new int[]{2,7,11,15};
        int[] input2 = new int[]{3,2,4};
        int[] input3 = new int[]{3,3};
        int[] output = twoSum.twoSum(input3, 6);
        System.out.println(Arrays.toString(output));
    }

    /*public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;
    }*/

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int targetNum = target - nums[i];
            if (map.containsKey(targetNum)){
                return new int[]{map.get(targetNum), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
