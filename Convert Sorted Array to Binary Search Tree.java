// leetcode 108 problem 
// 将有序数组转换为二叉搜索树

class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) return null;
        TreeNode head = helper(num, 0, num.length-1);
        return head;
    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid-1);
        node.right = helper(num, mid+1, high);
        return node;
    }
}