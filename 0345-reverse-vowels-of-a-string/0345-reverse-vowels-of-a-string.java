class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            if (vowels.indexOf(ans[start]) != -1 && vowels.indexOf(ans[end]) != -1) {
                char temp = ans[start];
                ans[start] = ans[end];
                ans[end] = temp;
                start++;
                end--;
            } 
            else if (vowels.indexOf(ans[start]) == -1) {
                start++;
            } 
            else if (vowels.indexOf(ans[end]) == -1) {
                end--;
            }
        } 
        return new String(ans);
    }
}
