class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();
        for(int n : nums1) s1.add(n);
        for(int n : nums2) s2.add(n);
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int n : s1){
            if(!s2.contains(n)) a1.add(n);
        } 
        List<Integer> a2 = new ArrayList<>();
        for (int n : s2) {
            if (!s1.contains(n)) a2.add(n);
        }
        return Arrays.asList(a1,a2);

    }
}