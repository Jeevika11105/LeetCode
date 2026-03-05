import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int max_len = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++ ){
            char c = s.charAt(r);
            if(seen.containsKey(c)){
                l = Math.max(l, seen.get(c) + 1);
            }
            seen.put(c,r);
            max_len = Math.max(max_len,(r-l)+1);
        }
        return max_len;
    }
}