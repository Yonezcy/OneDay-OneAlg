// leetcode 538 problem
// 将一颗BST转换为Greater Tree(所有结点的值加上比它大的所有结点的值形成的树)

class Solution {
    public int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    public void convert(TreeNode cur) {
        if (cur == null) return;
        convert(cur.right);
        cur.val += sum;
        sum = cur.val;
        convert(cur.left);
    }
}