class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length - k + 1];
        int idx = 0;
        int max = Integer.MIN_VALUE;

        //base case
        if(k == 1){
            return nums;
        }
    // find max element 
        for(int i = 0; i < k; i++){
            max = Math.max(max, nums[i]);
        }
        res[idx++] = max;
        
        for(int j = 1; j <= nums.length - k; j++){
            int outgoing = nums[j - 1];
            int incoming = nums[j + k - 1];
        // new element larger  --> new max
            if(incoming > max){
                max = incoming;
                res[idx++] = max;
                continue;
            }
            // duplicate max at left
            if(nums[j] ==  max){
                res[idx++] = max;
                continue;
            }
            // previous leaves the window
            if(outgoing == max){
                max = Integer.MIN_VALUE;
                for(int f = 0; f < k; f++){
                    max = Math.max(max, nums[j + f]);
                }
                res[idx++] = max;
            }
            else{
                res[idx++] = max;
            }
        }
        return res;
        
    }
}