// leetcode 530 problem
// 求出二叉搜索树中结点值的最小绝对值差

// In-oder traversal to guarantee sorted sequence because of BST.
class Solution {
    int min = Integer.MAX_VALUE;
    // prev is the value of last node in traversal, so it must be less than root because of BST.
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        getMinimumDifference(root.left);
        if (prev != null) {
            min = Math.min(min, root.val-prev);
        }
        prev = root.val;
        getMinimumDifference(root.right);
        return min;
    }
}