// leetcode 513 problem
// 求二叉树最底层最左边的结点值

// DFS Solution.
class Solution {
    public int maxDepth = 0;
    public int val = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 1);
        return val;
    }
    
    private void dfs(TreeNode root, int depth) {
        if (root != null) {
            if (depth > maxDepth) {
                val = root.val;
                maxDepth = depth;
            }
            dfs(root.left, depth+1);
            dfs(root.right, depth+1);
        }
    }
}