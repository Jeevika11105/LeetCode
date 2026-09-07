class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxsum = 0;
        long cursum = 0;
        HashSet<Integer> window = new HashSet<>();
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            // shrink --> nums[right] is in hashset or window.size > k
            while(window.contains(nums[right])){
                window.remove(nums[left]);
                cursum -= nums[left];
                left++;
            }
            // add to hashset
            window.add(nums[right]);
            cursum += nums[right];

            if(right - left + 1 > k){
                window.remove(nums[left]);
                cursum -= nums[left];
                left++;
            }

            if(right - left + 1 == k){
                maxsum= Math.max(maxsum, cursum);
            }

        }
        return maxsum;
        
    }
}