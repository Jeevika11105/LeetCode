class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        int l = colors.length;
        for(int i = 0; i < l; i++){
            if(colors[i] != colors[l-1]){
                max = Math.max(l-1-i, max);
                break;
            }
        }
        for(int i = l-1; i > 0; i--){
            if(colors[0] != colors[i]){
                max = Math.max(i,max);
                break;
            }
        }
        return max;
    }
}