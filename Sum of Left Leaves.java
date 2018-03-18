// leetcode 404 problem
// 求二叉树的左叶子的值的和

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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int ans = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) 
                ans += root.left.val;
            else ans += sumOfLeftLeaves(root.left);
        }
        ans += sumOfLeftLeaves(root.right);
        return ans;
    }
}