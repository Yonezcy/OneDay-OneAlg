// leetcode 543 problem
// 求二叉树的直径（两个结点间的最长路径）

// 过一个结点的最长路径一定是左子树与右子树的最大深度之和，遍历所有结点即可找出直径
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left+right);
        return Math.max(left, right) + 1;
    }
}