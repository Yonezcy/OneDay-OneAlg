// leetcode 145 problem
// 求二叉树的后序遍历序列

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
    public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> pre = new LinkedList<Integer>();
		preHelper(root, pre);
		return pre;
	}
    
	public void preHelper(TreeNode root, List<Integer> pre) {
		if (root == null) return;
		preHelper(root.left, pre);
		preHelper(root.right, pre);
        pre.add(root.val);
	}
}