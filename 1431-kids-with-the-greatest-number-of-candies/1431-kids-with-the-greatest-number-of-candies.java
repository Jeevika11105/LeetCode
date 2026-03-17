class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int MaxCandy = 0;
        for(int candy : candies){
            MaxCandy = Math.max(MaxCandy, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= MaxCandy);
        }
        return result;
    }
}