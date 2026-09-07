class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxcount = 0;
        int count = 0;

        for(int num:nums){
            if(num == 1){
                count++;
            }
            else{
                count = 0;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}