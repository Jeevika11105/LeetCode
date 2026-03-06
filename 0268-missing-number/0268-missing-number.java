class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i <= nums.length - 1; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;        
    }
}