class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiantQ = new LinkedList<>();
        Queue<Integer> direQ = new LinkedList<>();
        for(int i  = 0; i < n; i++){
            if(senate.charAt(i) == 'R'){
                radiantQ.add(i);
            }else{
                direQ.add(i);
            }
        }
        while(!radiantQ.isEmpty() && !direQ.isEmpty()){
            int rIdx = radiantQ.poll();
            int dIdx = direQ.poll();
            if(rIdx < dIdx){
                radiantQ.add(rIdx + n);
            }else{
                direQ.add(dIdx + n);
            }
        }
        return radiantQ.isEmpty() ? "Dire" : "Radiant";
    }
}