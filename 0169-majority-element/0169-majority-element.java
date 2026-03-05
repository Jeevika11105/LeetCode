class Solution {
    public int majorityElement(int[] nums) {
        int Candidate = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(Candidate == nums[i]){
                count ++;
            }
            else{
                count--;
            }
            if(count == 0){
                Candidate = nums[i];
                count = 1;
            }
        }
        return Candidate;
        
    }
}