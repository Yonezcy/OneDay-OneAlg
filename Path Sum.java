// leetcode 112 problem
// 判断二叉树是否有从根到叶子和为target的路径

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        
        if (root.left == null && root.right == null && root.val == sum) return true;
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}