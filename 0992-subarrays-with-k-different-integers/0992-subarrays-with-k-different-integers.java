class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums, k-1);
    }
    private int atmost(int[] nums, int k){
        if(k <= 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;
        for(int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0) + 1);

            while(map.size()>k){
                int n = nums[left];
                map.put(n,map.get(n)-1);
                if(map.get(n) == 0){
                    map.remove(n);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}