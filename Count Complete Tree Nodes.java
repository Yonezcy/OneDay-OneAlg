// leetcode 222 problem
// 计算完全二叉树的结点数(只有最后一层可以不满)

class Solution {
    public int countNodes(TreeNode root) {
        int h = height(root);
        if (h < 0) return 0;
        if (height(root.right) == h-1)
         	return countNodes(root.right) + (1 << h);
        return countNodes(root.left) + (1 << (h-1));
    }
    public int height(TreeNode root) {
        if (root == null) return -1;
        return height(root.left) + 1;
    }
}