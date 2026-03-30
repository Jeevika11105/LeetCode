class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0; // The biker starts at point 0 with altitude 0
        int currentAltitude = 0;
        
        for (int g : gain) {
            // Calculate the altitude at the next point
            currentAltitude += g;
            // Update the maximum altitude if the current one is higher
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        
        return maxAltitude;
    }
}
