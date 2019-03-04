// leetcode 230 problem
// 找出二叉搜索树中第k小的结点的值

// Solution: According to the number of nodes of left and right subtree to find it.
class Solution {
     public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        if (k <= count) return kthSmallest(root.left, k);
        else if (k > count+1) return kthSmallest(root.right, k-1-count); // 1 is counted as current node
        return root.val;
    }
    
    public int countNodes(TreeNode n) {
        if (n == null) return 0;
        return 1 + countNodes(n.left) + countNodes(n.right);
    }
}