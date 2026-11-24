class Solution {
    public int maxProduct(int[] nums) {
        int minprod = nums[0];
        int maxprod=nums[0];
        int ans = nums[0];
        for(int i=1; i<nums.length; ++i){
            if(nums[i] < 0){
                int temp = minprod;
                minprod = maxprod;
                maxprod = temp;
            }

            minprod = Math.min(nums[i], minprod*nums[i]);
            maxprod = Math.max(nums[i], maxprod*nums[i]);
            ans = Math.max(maxprod , ans);
        }
        return ans;
    }
}
    
