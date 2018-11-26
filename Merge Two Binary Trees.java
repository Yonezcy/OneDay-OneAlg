// leetcode 617 problem
// 合并两个二叉树(overlap的节点值等于两颗二叉树的节点的值的和)

// Extra space.
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newNode = new TreeNode(val);
        newNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return newNode;
    }
}

// In-place operation.
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
      if (t1 == null) return t2;
      if (t2 != null) {
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
      }
      return t1;
    }
}