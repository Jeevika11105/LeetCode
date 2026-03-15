class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for (String i : sentences) {
            count = Math.max(count, i.split(" ").length);
        }
        return count;
    }
}
