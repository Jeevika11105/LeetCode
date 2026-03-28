class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return 0;
        if(n  == 1) return nums[0];
        int prev1 = 0;
        int prev2 = 0;
        int current = 0;
        int maxp = 0;
        for(int i = 0; i < n-1; i++){
            current = Math.max(nums[i] + prev2 , prev1);
            prev2 = prev1;
            prev1 = current;
        }
        maxp = prev1;
        prev2 = 0;
        prev1 = 0;
        int maxp1 = 0;
        for (int i = 1; i < n; i++) {
            current = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = current;
        }
        maxp1 = prev1;
        if(maxp > maxp1){
            return maxp;
        }
        else{
            return maxp1;
        }
    }
}