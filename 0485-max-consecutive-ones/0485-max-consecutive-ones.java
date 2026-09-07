class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                left = right + 1;
            }
            else{
                maxcount = Math.max(right - left + 1, maxcount);
            }
        }
        return maxcount;
    }
}