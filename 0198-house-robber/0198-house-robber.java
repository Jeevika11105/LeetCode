class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for(int n : nums){
            int current = Math.max(n + prev2,prev1);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}