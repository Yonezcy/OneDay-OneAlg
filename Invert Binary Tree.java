// leetcode 226 problem
// 将一颗二叉树反转
// Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a 
// whiteboard

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        
        return root;
    }
}