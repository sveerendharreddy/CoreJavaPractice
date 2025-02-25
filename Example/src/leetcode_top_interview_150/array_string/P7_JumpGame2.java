package leetcode_top_interview_150.array_string;

public class P7_JumpGame2 {
    public static void main(String[] args) {
        int jump = jump(new int[]{2, 3, 1, 1, 4});
        System.out.println(jump);
    }

    public static int jump(int[] nums) {
        int reachable = 0;
        int jumpsRequired = 0;
        for(int i = 0;i < nums.length;i++){
            int updatedReachable = Math.max(reachable, i + nums[i]);
            if(reachable != updatedReachable) jumpsRequired++;
            reachable = updatedReachable;
            if(reachable >= nums.length - 1) return jumpsRequired;
        }
        return jumpsRequired;
    }
}
