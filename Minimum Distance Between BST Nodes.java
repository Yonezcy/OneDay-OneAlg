// Leetcode 783 problem
// 求BST里任意两个节点差的绝对值的最小值

// In-order traversal to guarantee sorted sequence because of BST.
class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    public int minDiffInBST(TreeNode root) {
        if (root == null) return min;
        minDiffInBST(root.left);
        if (prev != null) {
            min = Math.min(min, root.val-prev);
        }
        prev = root.val;
        minDiffInBST(root.right);
        return min;
    }
}