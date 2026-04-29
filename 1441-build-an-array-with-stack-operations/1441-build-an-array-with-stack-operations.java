class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int curr = 1;
        int i = 0;
        while(curr <= n && i < target.length){
            result.add("Push");
            if(target[i] == curr){
                i++;
            } else{
                result.add("Pop");
            }
            curr++;
        }
        return result;
    }
}