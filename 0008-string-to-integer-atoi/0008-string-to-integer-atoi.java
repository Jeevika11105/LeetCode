class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0;
        int n = s.length();

        // Step 1: Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // String was only whitespace
        if (i == n) return 0;

        // Step 2: Check for a single sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++; // move past the sign
        }

        // Step 3 & 4: Read digits and guard against overflow
        int total = 0;
        while (i < n) {
            char ch = s.charAt(i);

            // Stop at the first non-digit
            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';

            // If multiplying total by 10 will exceed 2,147,483,647
            if (total > Integer.MAX_VALUE / 10 || 
               (total == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            i++;
        }

        return total * sign;
    }
}