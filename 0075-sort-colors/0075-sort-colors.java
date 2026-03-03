class Solution {
    public void sortColors(int[] nums) {
        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        for(int i: nums){
            if(i == 0){
                n0++;
            }
            else if(i == 1){
                n1++;
            }else{
                n2++;
            }
        }
        int i = 0;
        for(i = 0; i < n0; i++){
            nums[i] = 0;
        }
        for(; i < n1 + n0; i++){
            nums[i] = 1;

        }
        for(; i < n2 + n1 + n0; i++){
            nums[i] = 2;
        }
    }
}