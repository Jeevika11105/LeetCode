class Solution {
    private boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int maxvowel = 0;
        int currentvowel = 0;

        for (int i = 0; i < k; i++) {
            if (isvowel(s.charAt(i))) {
                currentvowel++;
            }
        }
        
        maxvowel = currentvowel;

        for (int i = k; i < s.length(); i++) {
            if(maxvowel == k) return k;
            if (isvowel(s.charAt(i))) currentvowel++;
            if (isvowel(s.charAt(i-k))) currentvowel--;
            maxvowel = Math.max(maxvowel, currentvowel);
        }
        
        return maxvowel;   
    }
}
