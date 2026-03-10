class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = nums.length - 1;
        int index = n-1;
        while(left <= right){
            int left2 = nums[left] * nums[left];
            int right2 = nums[right] * nums[right];
            if(right2 > left2 ){
                ans[index] = right2;
                right --;
            }
            else{
                ans[index] = left2;
                left++;  
            }
            index--;
        } 
        return ans;
    }
}