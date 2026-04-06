class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        // 1. Store row frequencies
        for (int[] row : grid) {
            List<Integer> rowList = new ArrayList<>();
            for (int val : row) {
                rowList.add(val);
            }
            rowMap.put(rowList, rowMap.getOrDefault(rowList, 0) + 1);
        }

        // 2. Build columns and check against the map
        for (int j = 0; j < n; j++) {
            List<Integer> colList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                colList.add(grid[i][j]);
            }
            // 3. Add frequency to count
            count += rowMap.getOrDefault(colList, 0);
        }

        return count;
    }
}