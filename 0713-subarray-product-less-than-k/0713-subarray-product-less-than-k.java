class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1 ){
            return 0;
        }
        int n = nums.length;
        int start = 0;
        int end = 0;
        int product = 1;
        int count = 0;
        while(end < n){
            //Expand Window 
            product = product * nums[end];
            //Shirk Window
            while(product >= k){
                product = product/nums[start];
                start++;
            }
            count = count + (end - start + 1);
            end++;
        }
        return count;
    }
}