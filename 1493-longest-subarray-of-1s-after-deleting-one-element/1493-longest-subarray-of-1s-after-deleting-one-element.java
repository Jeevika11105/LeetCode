class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            // Count zeros in the current window
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink window from the left if more than one zero is present
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // The window size is (right - left + 1). 
            // After "deleting" one element (even if it's a 1), 
            // the remaining 1s length is (right - left).
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
