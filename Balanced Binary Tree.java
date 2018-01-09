// leetcode 110 problem
// 判断一个二叉树是否是平衡二叉树

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// first Solution：自顶向下搜索
// 算法思想为，判断当前结点是否是平衡二叉树需判断，1.左子树和右子树的深度是否<=1，2.左子树和右子树均为平衡二叉树
class Solution {
    public int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        int left = depth(root.left);
        int right = depth(root.right);
        
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
}

// second Solution：自下而上搜索
class Solution {
    public int dfsHeight(TreeNode root) {
        if (root == null) return 0;
        
        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
}