class Solution {
    public boolean isPalindrome(String s) {
        String B = s.replaceAll("[^A-Za-z0-9]","");
        String C = B.toLowerCase();
        int p = 0;
        int q = C.length() - 1;
        while(p < q){
            if(C.charAt(p) == C.charAt(q)){
                p++;
                q--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}