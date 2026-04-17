class Solution {
    // Make these class-level so both methods can see them
    int count = 0;
    Map<Long, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        // Essential: Clear/Initialize the map for every fresh call
        map.put(0L, 1);
        dfs(root, 0L, targetSum);
        return count;
    }

    private void dfs(TreeNode node, long curr, int sum) {
        // 1. Base case: If we hit a null node, stop
        if (node == null) return;

        // 2. Update the running sum
        curr += node.val;

        // 3. Check if a valid path ends at this node
        count += map.getOrDefault(curr - sum, 0);

        // 4. Add current sum to map to 'offer' it to children
        map.put(curr, map.getOrDefault(curr, 0) + 1);

        // 5. Recurse down
        dfs(node.left, curr, sum);
        dfs(node.right, curr, sum);

        // 6. Backtrack: Remove current sum so it doesn't affect other branches
        map.put(curr, map.get(curr) - 1);
    }
}