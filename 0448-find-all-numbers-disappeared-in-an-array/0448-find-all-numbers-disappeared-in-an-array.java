import java.util.Hashtable;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Hashtable<Integer, Integer> result = new Hashtable<>();
        for(int i  = 0 ; i < nums.length; i++){
             result.put(nums[i], i);
        }
        for(int i = 1; i <= nums.length; i++){
            if(result.get(i) == null){
                ans.add(i);
            }
        }
        return ans; 
    }
}